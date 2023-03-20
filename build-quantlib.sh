#!/usr/bin/env bash

QUANTLIB_VERSION="QuantLib-v1.29"
QUANTLIB_SWIG_VERSION="QuantLib-SWIG-v1.29"
PROJ_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" >/dev/null 2>&1 && pwd )"
BUILD_DIR="$(mktemp -d)"
trap 'rm -rf -- "$BUILD_DIR"' EXIT
echo "Building in ${BUILD_DIR}"

QL_DIR="${BUILD_DIR}/QuantLib"
QL_SWIG_DIR="${BUILD_DIR}/QuantLib-SWIG"
QL_INSTALL_DIR="${QL_DIR}/install"
LIB_DIR="${PROJ_DIR}/src/main/resources/$( uname -s )/$( uname -m )"

mkdir -p "${LIB_DIR}"

git clone https://github.com/lballabio/QuantLib.git "${QL_DIR}"
pushd "${QL_DIR}"
git checkout ${QUANTLIB_VERSION}
mkdir build
pushd build
cmake .. -G "Unix Makefiles" -DCMAKE_BUILD_TYPE=Release -DCMAKE_INSTALL_PREFIX=${QL_INSTALL_DIR} -DQL_BUILD_BENCHMARK=OFF -DQL_BUILD_EXAMPLES=OFF -DQL_BUILD_TEST_SUITE=OFF
make install
popd
cp -v "${QL_INSTALL_DIR}/lib/libQuantLib.so" "${LIB_DIR}"
popd

git clone https://github.com/lballabio/QuantLib-SWIG.git "${QL_SWIG_DIR}"
pushd "${QL_SWIG_DIR}"
git checkout ${QUANTLIB_SWIG_VERSION}
./autogen.sh
rm -rf "${PROJ_DIR}/src/main/java/org/quantlib"
mkdir -p "${PROJ_DIR}/src/main/java/org/quantlib"
swig -DJAVA_AUTOLOAD -java -c++ -outdir "${PROJ_DIR}"/src/main/java/org/quantlib -package org.quantlib \
    -o "${PROJ_DIR}/src/main/cpp/quantlib_wrap.cpp" SWIG/quantlib.i

pushd "${PROJ_DIR}"/src/main/cpp
g++ -c quantlib_wrap.cpp -fno-strict-aliasing -fPIC -g -O2 -I"${JAVA_HOME}/include" \
    -I"${JAVA_HOME}/include/linux" -I"${QL_INSTALL_DIR}/include" -o quantlib_wrap.o
g++ -g -O2 -shared quantlib_wrap.o -L"${QL_INSTALL_DIR}/lib" -lQuantLib -o "${LIB_DIR}/libQuantLibJNI.so"
popd
popd


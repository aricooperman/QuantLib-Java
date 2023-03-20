import org.quantlib.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * EquityOption Test app - java version of QuantLib/Examples/EquityOption
 * to illustrate use of Quantlib through supplied SWIG interfaces.
 *
 * You need to run this with a correctly set library path and something like:
 *
 * -Djava.library.path=/usr/local/lib
 *
 * @author Richard Gomes
 * @author Tito Ingargiola
 */
public class OptionTool {

    public static void main(String[] args) throws Exception {
        // our option
        Option.Type type = Option.Type.Put;
        double strike = 30.0;
        double underlying = 39.41;
        double riskFreeRate = 0.0074;
        double dividendYield = 0.048;

        Date todaysDate = new Date(27, Month.August, 2020);
        Date settlementDate = todaysDate;

        DayCounter dayCounter = new Actual365Fixed();
        Calendar calendar = new TARGET();

        // write column headings
        String fmt = "\n%-35s,%-35s,%-14s\n";
        System.out.printf(fmt, "Date", "Exercise Date", "Price");
        System.out.println("============================================================================");

        // define the underlying asset and the yield/dividend/volatility curves
        QuoteHandle underlyingH = new QuoteHandle(new SimpleQuote(underlying));
        YieldTermStructureHandle flatTermStructure =
            new YieldTermStructureHandle(new FlatForward(
                                  settlementDate, riskFreeRate, dayCounter));
        YieldTermStructureHandle flatDividendYield =
            new YieldTermStructureHandle(new FlatForward(
                                  settlementDate, dividendYield, dayCounter));

        fmt = "%-34s,%-34s,%13.9f\n";

        // define American exercises\
        List<Date> exerciseDates = List.of(
                new Date(18, Month.September,2020),
                new Date(16, Month.October,2020),
                new Date(15, Month.January, 2021),
                new Date(16, Month.April, 2021),
                new Date(21, Month.January, 2022));
        double[] prices = new double[] { 0.04, 0.13, 0.65, 1.19, 2.59 };
        double[] volatilites = new double[] { 0.5202, 0.4309, 0.3992, 0.3789, 0.3516 };

        for( Date day = todaysDate; day.serialNumber() <= exerciseDates.get(4).serialNumber(); day = calendar.advance(day, 1, TimeUnit.Days)) {
            Settings.instance().setEvaluationDate(day);

            for (int i = 0; i < prices.length; ++i) {
                Date exerciseDate = exerciseDates.get(i);
                if(exerciseDate.serialNumber() < day.serialNumber())
                    continue;

                BlackVolTermStructureHandle flatVolatility =
                        new BlackVolTermStructureHandle(new BlackConstantVol(
                                settlementDate, calendar, volatilites[i], dayCounter));

                BlackScholesMertonProcess stochasticProcess =
                        new BlackScholesMertonProcess(underlyingH,
                                flatDividendYield,
                                flatTermStructure,
                                flatVolatility);

                // options
                PlainVanillaPayoff payoff = new PlainVanillaPayoff(type, strike);
                Exercise americanExercise = new AmericanExercise(settlementDate, exerciseDate);
                VanillaOption americanOption = new VanillaOption(payoff, americanExercise);

                            americanOption.setPricingEngine(new BaroneAdesiWhaleyEngine(stochasticProcess));
                //            americanOption.setPricingEngine(new BjerksundStenslandEngine(stochasticProcess));
                //            int timeSteps = 801;
                //            americanOption.setPricingEngine(
                //                    new FdBlackScholesVanillaEngine(stochasticProcess,
                //                            timeSteps,
                //                            timeSteps-1));
                //            americanOption.setPricingEngine(new BinomialJRVanillaEngine(
                //                    stochasticProcess, timeSteps));
                //            americanOption.setPricingEngine(
                //                    new BinomialCRRVanillaEngine(stochasticProcess, timeSteps));
                //            americanOption.setPricingEngine(
                //                    new BinomialJ4VanillaEngine(stochasticProcess, timeSteps));

//                System.out.printf(fmt, exerciseDate,
//                        americanOption.NPV(), americanOption.impliedVolatility(prices[i], stochasticProcess));

                System.out.printf(fmt, day, exerciseDate, americanOption.NPV());
            }
        }
    }
}


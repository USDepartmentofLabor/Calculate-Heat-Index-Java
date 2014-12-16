package src.main.java.gov.dol;

import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 * Utility class to calculate the heat index, given a Fahrenheit temperature (F) and relative humidity (rh).
 *
 * See http://www.srh.noaa.gov/images/ffc/pdf/ta_htindx.PDF for calculation details, noting that there is a
 * degree of variance in result to be expected since the equation is an approximation derived from regression analysis.
 */
public class CalculateHeatIndex {
    public static final String RESULT_FORMAT = "#.#";

    public static double heatIndexCal(double F, double rh) {
        double Hindex;

        Hindex = -42.379 + 2.04901523 * F + 10.14333127 * rh;
        Hindex = Hindex - 0.22475541 * F * rh - 6.83783 * Math.pow(10, -3) * F * F;
        Hindex = Hindex - 5.481717 * Math.pow(10, -2) * rh * rh;
        Hindex = Hindex + 1.22874 * Math.pow(10, -3) * F * F * rh;
        Hindex = Hindex + 8.5282 * Math.pow(10, -4) * F * rh * rh;
        Hindex = Hindex - 1.99 * Math.pow(10, -6) * F * F * rh * rh;

        DecimalFormat df = new DecimalFormat(RESULT_FORMAT);
        df.setRoundingMode(RoundingMode.HALF_UP);
        return Double.parseDouble(df.format(Hindex));
    }
}
public class calculateHeatIndex{

	public static double heatIndexCal(double F, double rh) {
		double Hindex;

	    Hindex = -42.379 + 2.04901523*F + 10.14333127*rh;
	    Hindex = Hindex - 0.22475541*F*rh - 6.83783*Math.pow(10,-3)*F*F;
	    Hindex = Hindex	- 5.481717*Math.pow(10,-2)*rh*rh;
	    Hindex = Hindex	+ 1.22874*Math.pow(10,-3)*F*F*rh ;
	    Hindex = Hindex	+ 8.5282*Math.pow(10,-4)*F*rh*rh ;
	    Hindex = Hindex	- 1.99*Math.pow(10,-6)*F*F*rh*rh;

	    Hindex = roundOff(Hindex);
	    return Hindex;
	}


	public static double  roundOff(double value)
	{
		value = (double) Math.round(10*value)/10;
		return value;
	}
}

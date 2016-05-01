
/**
 * sets of Area and its unit
 * @author Napon Kittisiriprasert
 */
public enum Area implements Unit{
	SQUARE_METER("SqMeter", 1.0),
	SQUARE_CENTIMETER("SqCentimeter", 0.0001),
	SQUARE_KILOMETER("SqKilometer", 1.0e+6),
	SQUARE_MILE("SqMile", 2.59e+6),
	SQUARE_FOOT("SqFoot", 0.0929),
	SQUARE_INCH("SqInch", 6.4516e-4),
	SQUARE_WA("SqWa", 4.0);
	
	public final String name;
	
	public final double value;
	
	/**
	 * constructor
	 * @param n the name
	 * @param v the value
	 */
	private Area(String n, double v) {
		name = n;
		value = v;
	}
	
	public double getValue() { return value; }
	public String toString() { return name; }
}

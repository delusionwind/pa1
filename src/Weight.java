
/**
 * sets of Weight and its unit
 * @author Napon Kittisiriprasert
 */
public enum Weight implements Unit{
	KILOGRAM("Kilogram", 1.0),
	GRAM("Gram", 0.001),
	MILLOGRAM("Milligram", 1.0e-6),
	POUND("Pound", 0.4536),
	TONNE("Tonne", 1000),
	KEED("Keed", 0.1);
	
	public final String name;
	
	public final double value;
	
	/**
	 * constructor
	 * @param n the name
	 * @param v the value
	 */
	private Weight(String n, double v) {
		name = n;
		value = v;
	}
	
	public double getValue() { return value; }
	public String toString() { return name; }
}


/**
 * sets of Time and its unit
 * @author Napon Kittisiriprasert
 */
public enum Time implements Unit{
	SECOND("Second", 1.0),
	MINUTE("Minute", 60),
	HOUR("Hour", 3600),
	DAY("Day", 86400),
	WEEK("Week", 604800),
	MONTH("Month", 2592000);
	
	public final String name;
	
	public final double value;
	
	/**
	 * constructor
	 * @param n the name
	 * @param v the value
	 */
	private Time(String n, double v) {
		name = n;
		value = v;
	}
	
	public double getValue() { return value; }
	public String toString() { return name; }
}

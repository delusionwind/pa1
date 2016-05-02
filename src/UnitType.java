
/**
 * sets of various units.
 * @author Napon Kittisiriprasert
 */
public enum UnitType {
	LENGTH("Length", Length.values()),
	AREA("Area", Area.values()),
	WEIGHT("Weight", Weight.values());
	
	private Unit[] units;
	private String name;
	
	/**
	 * constructor
	 * @param n the name of unit.
	 * @param u the array of unit.
	 */
	private UnitType(String n, Unit[] u) {
		this.name = n;
		this.units = u;
	}
	
	public Unit[] getUnits() {
		return units;
	}
	
	public String toString() {
		return name;
	}
}

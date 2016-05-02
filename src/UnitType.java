
public enum UnitType {
	LENGTH("Length", Length.values()),
	AREA("Area", Area.values()),
	WEIGHT("Weight", Weight.values());
	
	private Unit[] units;
	private String name;
	
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

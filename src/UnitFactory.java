
public class UnitFactory {
	private static UnitFactory instance = new UnitFactory();
	
	private UnitFactory() {}
	
	public static UnitFactory getInstance() {
		return instance;
	}
	
	public UnitType[] getUnitTypes() {
		return UnitType.values();
	}
	
	public Unit[] getUnits(UnitType uType) {
		return uType.getUnits();
	}
}

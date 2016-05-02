
/**
 * Unit factory for creating instance for singleton method.
 * @author Napon Kittisiriprasert
 */
public class UnitFactory {
	/**
	 * made the instance for usage.
	 */
	private static UnitFactory instance = new UnitFactory();
	
	/**
	 * private constructor of UnitFactory.
	 */
	private UnitFactory() {}
	
	/**
	 * @return the instance of UnitFactory.
	 */
	public static UnitFactory getInstance() {
		return instance;
	}
	
	/**
	 * @return the all types of unit.
	 */
	public UnitType[] getUnitTypes() {
		return UnitType.values();
	}
	
	/**
	 * @param uType the specified unit type.
	 * @return the units of the specified type.
	 */
	public Unit[] getUnits(UnitType uType) {
		return uType.getUnits();
	}
}

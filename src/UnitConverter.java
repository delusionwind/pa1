
/**
 * the distance converter calculation class.
 * @author Napon Kittisiriprasert
 */
public class UnitConverter {
	/**
	 * convert the receive amount from its current unit to target unit.
	 * @param amount the input amount to be converted
	 * @param fromUnit the unit of the amount
	 * @param toUnit the target unit to be convert to
	 * @return the converted amount
	 */
	public double convert(double amount, Unit fromUnit, Unit toUnit ) {
		double x = amount*fromUnit.getValue();
		return x/toUnit.getValue();
	}
	
	/**
	 * return array of unit type to be used.
	 * @return the array if unit types from UnitFactory
	 */
	public  UnitType[] getUnitTypes() {
		return UnitFactory.getInstance().getUnitTypes();
	}
	
	/**
	 * return array of unit to be used.
	 * @return the array of units from the UnitFactory
	 */
	public Unit[] getUnits(UnitType unitType) {
		return UnitFactory.getInstance().getUnits(unitType);
	}
}

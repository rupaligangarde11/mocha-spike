package main.quantity;

public class Length extends Quantity{

    public Length(double quantity, UnitOfLength unitOfLength) {
        super(quantity,unitOfLength);
    }

    public static boolean checkEquality(Length one, Length base) {
        double totalValue = Util.roundOf(one.amount * one.unit.getConversionValue());
        return totalValue == base.amount;
    }
    public static Length total(Length length1, Length length2, UnitOfLength expectedUnit) {

        double totalLengthInBaseUnit = getLengthInBaseUnit(length1) + getLengthInBaseUnit(length2);
        double totalLengthInExpectedUnit = totalLengthInBaseUnit/(expectedUnit.getConversionValue());

        return new Length(Util.roundOf(totalLengthInExpectedUnit),expectedUnit);
    }
    private static double getLengthInBaseUnit(Length length){
        return length.amount * length.unit.getConversionValue();
    }
}

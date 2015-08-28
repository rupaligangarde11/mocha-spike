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

        double length1InBaseUnit = length1.amount * length1.unit.getConversionValue();
        double length2InBaseUnit = length2.amount * length2.unit.getConversionValue();
        double totalLengthInBaseUnit = length1InBaseUnit + length2InBaseUnit;

        double totalLengthInExpectedUnit = totalLengthInBaseUnit/(expectedUnit.getConversionValue());

        return new Length(Util.roundOf(totalLengthInExpectedUnit),expectedUnit);
    }
}

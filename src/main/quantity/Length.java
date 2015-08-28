package main.quantity;

public class Length extends Quantity{

    public Length(double quantity, UnitOfLength unitOfLength) {
        super(quantity,unitOfLength);
    }

    public static boolean checkEquality(Length one, Length base) {
        double totalValue = one.amount * one.unit.getConversionValue();
        return totalValue == base.amount;
    }
}

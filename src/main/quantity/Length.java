package main.quantity;

public class Length extends Quantity{

    public Length(double quantity, UnitOfLength unitOfLength) {
        super(quantity,unitOfLength);
    }

    public static boolean checkEquality(Length from, Length to) {
        double totalBaseValue = from.amount * from.unit.getBaseValue();
        if(totalBaseValue == to.amount) return true;
        return false;
    }
}

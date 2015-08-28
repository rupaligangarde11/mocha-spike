package main.quantity;

public class Volume extends Quantity{

    public Volume(double quantity, UnitOfVolume unitOfVolume) {
        super(quantity,unitOfVolume);
    }
    public static boolean checkEquality(Volume from, Volume to) {
        double totalBaseValue = from.amount * from.unit.getBaseValue();
        if(totalBaseValue == to.amount) return true;
        return false;
    }
}

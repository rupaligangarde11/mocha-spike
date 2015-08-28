package main.quantity;

public class Volume extends Quantity{

    public Volume(double quantity, UnitOfVolume unitOfVolume) {
        super(quantity,unitOfVolume);
    }
    public static boolean checkEquality(Volume one, Volume base) {
        double totalValue = one.amount * one.unit.getConversionValue();
        return totalValue == base.amount;
    }
}

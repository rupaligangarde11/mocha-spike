package main.quantity;

public class Volume extends Quantity{

    public Volume(double quantity, UnitOfVolume unitOfVolume) {
        super(quantity,unitOfVolume);
    }
    public static boolean checkEquality(Volume one, Volume base) {
        double totalValue = Util.roundOf(one.amount * one.unit.getConversionValue());
        return totalValue == base.amount;
    }

    public static Volume total(Volume volume1, Volume volume2, UnitOfVolume expectedUnit) {


        double volume1InBaseUnit = volume1.amount * volume1.unit.getConversionValue();
        double volume2InBaseUnit = volume2.amount * volume2.unit.getConversionValue();
        double totalVolumeInBaseUnit = volume1InBaseUnit + volume2InBaseUnit;

        double totalValueInExpectedUnit = totalVolumeInBaseUnit/(expectedUnit.getConversionValue());

        return new Volume(Util.roundOf(totalValueInExpectedUnit),expectedUnit);
    }
}

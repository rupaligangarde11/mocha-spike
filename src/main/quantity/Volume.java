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

        double totalVolumeInBaseUnit = getVolumeInBaseUnit(volume1) + getVolumeInBaseUnit(volume2);
        double totalValueInExpectedUnit = totalVolumeInBaseUnit/(expectedUnit.getConversionValue());

        return new Volume(Util.roundOf(totalValueInExpectedUnit),expectedUnit);
    }
    private static double getVolumeInBaseUnit(Volume volume){
        return volume.amount * volume.unit.getConversionValue();
    }
}

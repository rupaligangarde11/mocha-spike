package main.quantity;

public enum UnitOfVolume implements Unit {
    MILLILITRE(1.0),LITRE(1000.0), GALLON(3785.41), PINT(473.176), TABLESPOON(14.7868);

    private final double value;
    UnitOfVolume(double v){
        value = v;
    }
    @Override
    public double getBaseValue() {
        return value;
    }
}


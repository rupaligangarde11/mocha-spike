package main;

public enum UnitOfVolume implements Unit {
    LITRE, GALLON, MILLILITRE, PINT, TABLESPOON;

    public final int value;
    UnitOfVolume(){
        value = ordinal();
    }
    @Override
    public int getValue() {
        return value;
    }
}


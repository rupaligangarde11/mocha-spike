package main.quantity;

public enum UnitOfLength implements Unit {
    CM(1.0), INCH(2.54), FOOT(30.48), METER(100.0);

    private final double value;

    UnitOfLength(double v){
        value = v;
    }

    @Override
    public double getConversionValue()
    {
        return value;
    }
}
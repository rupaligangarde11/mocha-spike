package main;

interface Unit{
    int getValue();
}
public enum UnitOfLength implements Unit {
    CM, INCH, FOOT, METER;
    public final int value;

     UnitOfLength(){
        value = ordinal();
    }
    @Override
    public int getValue() {
        return value;
    }
}

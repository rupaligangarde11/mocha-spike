package main.quantity;

public abstract class Quantity {
    protected double amount;
    protected Unit unit;
    Quantity(double amount, Unit unit){
        this.amount = amount;
        this.unit= unit;
    }
}

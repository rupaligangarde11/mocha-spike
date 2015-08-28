package main.quantity;

public abstract class Quantity {
    double amount;
    Unit unit;
    Quantity(double amount, Unit unit){
        this.amount = amount;
        this.unit= unit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Quantity quantity1 = (Quantity) o;

        return Double.compare(quantity1.amount, amount) == 0;

    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(amount);
        return (int) (temp ^ (temp >>> 32));
    }

}

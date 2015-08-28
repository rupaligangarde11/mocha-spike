package main.quantity;

public abstract class Quantity {
    protected double amount;
    protected Unit unit;
    Quantity(double amount, Unit unit){
        this.amount = amount;
        this.unit= unit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Quantity quantity = (Quantity) o;

        if (Double.compare(quantity.amount, amount) != 0) return false;
        return !(unit != null ? !unit.equals(quantity.unit) : quantity.unit != null);

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(amount);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + (unit != null ? unit.hashCode() : 0);
        return result;
    }
}

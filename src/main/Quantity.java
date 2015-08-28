package main;

public class Quantity {
    double quantity;
    Unit unit;
    Quantity(double quantity, Unit unit){
        this.quantity=quantity;
        this.unit= unit;
    }
}

class Length extends Quantity{

    public Length(double quantity, UnitOfLength unitOfLength) {
        super(quantity,unitOfLength);
    }

}
class Volume extends Quantity{

    public Volume(double quantity, UnitOfVolume unitOfVolume) {
        super(quantity,unitOfVolume);
    }
}

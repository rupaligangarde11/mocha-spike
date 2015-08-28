package main;

public interface Converter {
    public boolean convert(Material from,Material to);
}

 class FootToInch implements Converter {
    public boolean convert(Material from, Material to){
     return false;
    }
    private double footToInchConversion(double quantityInFoot) {
        return quantityInFoot * 12;
    }
}

 class InchToCm implements Converter {
    public boolean convert(Material from, Material to){
        return false;
    }
    private double inchToCmConversion(double quantityInInch) {
        return quantityInInch * 2.54;
    }
}
class GallonToLitre implements Converter {
    public boolean convert(Material from, Material to){
        return false;
    }
    private double gallonToLitreConversion(double quantityInGallon) {
        return quantityInGallon * 3.7854;
    }
}




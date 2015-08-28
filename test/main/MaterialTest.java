package main;

import junit.framework.TestCase;

public class MaterialTest extends TestCase {

    public void testQuantityForInchesToCms() {
        Material inInches = new Material(1,MeasurementType.INCH);
        Material inCm = new Material(2.54,MeasurementType.CM);
        Converter inchToCmConverter= new InchToCm();
        assertTrue(inchToCmConverter.convert(inInches, inCm));
    }

    public void testQuantityForFootToInches() {
        Material inFoot = new Material(1,MeasurementType.FOOT);
        Material inInch = new Material(12,MeasurementType.INCH);
        Converter footToInchConverter= new FootToInch();
        assertTrue(footToInchConverter.convert(inInch, inFoot));
    }

    public void testQuantityForGallonToLitre(){
        Material inGallon = new Material(1,MeasurementType.GALLON);
        Material inLitre = new Material(3.7854,MeasurementType.LITRE);
        Converter gallonToLitreConverter= new GallonToLitre();
        assertTrue(gallonToLitreConverter.convert(inGallon, inLitre));
    }
}

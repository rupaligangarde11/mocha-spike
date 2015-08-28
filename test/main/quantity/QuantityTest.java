package main.quantity;

import junit.framework.TestCase;
import main.quantity.Length;
import main.quantity.UnitOfLength;
import main.quantity.UnitOfVolume;
import main.quantity.Volume;

public class QuantityTest extends TestCase {

    public void testOneForEqualityInchToCentimeter() {
        Length lengthInInch = new Length(1, UnitOfLength.INCH);
        Length lengthInCm = new Length(2.54, UnitOfLength.CM);
        assertTrue(Length.checkEquality(lengthInInch, lengthInCm));
    }

    public void testTwoForEqualityMeterToInch() {
        Length lengthInMeter = new Length(1, UnitOfLength.METER);
        Length lengthInCm = new Length(100.0, UnitOfLength.CM);
        assertTrue(Length.checkEquality(lengthInMeter, lengthInCm));
    }

    public void testForEqualityForFootToCentimeter() {
        Length lengthInFoot = new Length(1, UnitOfLength.FOOT);
        Length lengthInCm = new Length(30.48, UnitOfLength.CM);
        assertTrue(Length.checkEquality(lengthInFoot, lengthInCm));
    }

    public void testForEqualityForLitreToMilliLitre() {
        Volume volumeInLitre = new Volume(1, UnitOfVolume.LITRE);
        Volume volumeInMilliLitre = new Volume(1000.0, UnitOfVolume.MILLILITRE);
        assertTrue(Volume.checkEquality(volumeInLitre, volumeInMilliLitre));
    }
    public void testForEqualityForGallonToMilliLitre() {
        Volume volumeInGallon = new Volume(1, UnitOfVolume.GALLON);
        Volume volumeInMilliLitre = new Volume(3785.41, UnitOfVolume.MILLILITRE);
        assertTrue(Volume.checkEquality(volumeInGallon, volumeInMilliLitre));
    }
    public void testForEqualityForPintToMilliLitre() {
        Volume volumeInPint = new Volume(1, UnitOfVolume.PINT);
        Volume volumeInMilliLitre = new Volume(473.176, UnitOfVolume.MILLILITRE);
        assertTrue(Volume.checkEquality(volumeInPint, volumeInMilliLitre));
    }
    public void testForEqualityForTableSpoonToMilliLitre() {
        Volume volumeInTableSpoon = new Volume(1, UnitOfVolume.TABLESPOON);
        Volume volumeInMilliLitre = new Volume(14.7868, UnitOfVolume.MILLILITRE);
        assertTrue(Volume.checkEquality(volumeInTableSpoon, volumeInMilliLitre));
    }
}
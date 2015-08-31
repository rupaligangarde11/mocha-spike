package main.quantity;

import junit.framework.TestCase;

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
        Volume volumeInMilliLitre = new Volume(473.18, UnitOfVolume.MILLILITRE);
        assertTrue(Volume.checkEquality(volumeInPint, volumeInMilliLitre));
    }
    public void testForEqualityForTableSpoonToMilliLitre() {
        Volume volumeInTableSpoon = new Volume(1, UnitOfVolume.TABLESPOON);
        Volume volumeInMilliLitre = new Volume(14.79, UnitOfVolume.MILLILITRE);
        assertTrue(Volume.checkEquality(volumeInTableSpoon, volumeInMilliLitre));
    }
    public void testTotalQuantityOfVolumeWhenBothUnitsAreSame(){
        Volume volumeInLitre1 = new Volume(1,UnitOfVolume.LITRE);
        Volume volumeInLitre2 = new Volume(2,UnitOfVolume.LITRE);

        UnitOfVolume expectedUnit = UnitOfVolume.LITRE;
        Volume expectedVolume = new Volume(3,expectedUnit);

        assertTrue(expectedVolume.equals(Volume.total(volumeInLitre1, volumeInLitre2, expectedUnit)));
    }
    public void testTotalQuantityOfVolumeWhenUnitsAreDifferent(){
        Volume volumeInMilliLitre = new Volume(3785.41,UnitOfVolume.MILLILITRE);
        Volume volumeInGallon = new Volume(1,UnitOfVolume.GALLON);

        UnitOfVolume expectedUnit = UnitOfVolume.GALLON;
        Volume expectedVolume = new Volume(2,expectedUnit);

        assertTrue(expectedVolume.equals(Volume.total(volumeInMilliLitre,volumeInGallon,expectedUnit)));
    }
    public void testTotalQuantityOfVolumeWhenExpectedUnitIsTableSpoon(){
        Volume volumeInLitre = new Volume(1,UnitOfVolume.LITRE);
        Volume volumeInPint = new Volume(1,UnitOfVolume.PINT);

        UnitOfVolume expectedUnit = UnitOfVolume.TABLESPOON;
        Volume expectedVolume = new Volume(99.63,expectedUnit);

        assertTrue(expectedVolume.equals(Volume.total(volumeInLitre,volumeInPint,expectedUnit)));
    }
    public void testTotalQuantityOfLengthWhenBothUnitsAreSame(){
        Length meter1 = new Length(1,UnitOfLength.METER);
        Length meter2 = new Length(2,UnitOfLength.METER);

        Length meter3 = new Length(3, UnitOfLength.METER);

        assertTrue(meter3.equals(Length.total(meter1, meter2, UnitOfLength.METER)));
    }
    public void testTotalQuantityOfLengthWhenUnitsAreDifferent(){
        Length lengthInMeter1 = new Length(1,UnitOfLength.METER);
        Length lengthInInch = new Length(1,UnitOfLength.INCH);

        UnitOfLength expectedUnit = UnitOfLength.INCH;
        Length expectedVolume = new Length(40.37,expectedUnit);

        assertTrue(expectedVolume.equals(Length.total(lengthInMeter1, lengthInInch, expectedUnit)));
    }
    public void testTotalQuantityOfLengthWhenExpectedUnitIsCentimeter(){
        Length lengthInMeter = new Length(1,UnitOfLength.METER);
        Length lengthInFoot = new Length(1,UnitOfLength.FOOT);

        UnitOfLength expectedUnit = UnitOfLength.CM;
        Length expectedVolume = new Length(130.48,expectedUnit);

        assertTrue(expectedVolume.equals(Length.total(lengthInMeter, lengthInFoot, expectedUnit)));
    }
}
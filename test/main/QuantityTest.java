package main;

import junit.framework.TestCase;

public class QuantityTest extends TestCase {

    public void testQuantityForInchesToCms() {
        Length lengthInInch = new Length(1,UnitOfLength.INCH);
        Length lengthInCm = new Length(2.54,UnitOfLength.CM);
        assertEquals(lengthInInch,lengthInCm);
    }

    public void testQuantityForGallonToLitre(){

    }
}

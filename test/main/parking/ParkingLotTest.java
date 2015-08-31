package main.parking;

import junit.framework.TestCase;

class ParkingLotTest extends TestCase {

    void testParkingACarWhenParkingSlotIsAvailable(){
        ParkingLot parkingLot = new ParkingLot();
        Car hondaCity = new Car("MH14-6745");
        int slotNumber = parkingLot.park(hondaCity);
    }
}

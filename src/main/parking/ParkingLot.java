package main.parking;

import java.util.HashMap;
import java.util.Map;

public class ParkingLot {
    private static final int INT = 100;
    private Map<Integer,Car> parkingCatalog = new HashMap<>();

    public int park(Car car){
        if(isAvailable()){
            int slot = getEmptySlot();
            parkingCatalog.put(slot, car);
            return slot;
        }
        return -1;
    }

    private boolean isAvailable(){
        return parkingCatalog.size() < INT;
    }

    private int getEmptySlot() {
        return parkingCatalog.size();
    }
}

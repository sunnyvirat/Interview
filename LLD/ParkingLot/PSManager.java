package com.abb.demoCRUD.ParkingLot;
import java.util.List;

public abstract class PSManager {
    List<ParkingSpot> psList;
    PSManager(List<ParkingSpot> psList)
    {
        this.psList = psList;
    }
    public abstract int findParkingSpot(Vehicle vehicle);

    public boolean parkVehicle(int spotId)
    {
        ParkingSpot parkingSpot = psList.get(spotId);
        parkingSpot.parkVehicle();
        System.out.println("Vehicle is Parked at spot " + spotId);
        return true;
    }
    public boolean removeVehicle(int spotId)
    {
        ParkingSpot parkingSpot = psList.get(spotId);
        parkingSpot.removeVehicle();
        return true;
    }
}

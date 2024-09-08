package com.abb.demoCRUD.ParkingLot;
import java.util.List;
public class FourWheelerManager extends PSManager{
    public FourWheelerManager(List<ParkingSpot> psList)
    {
        super(psList);
    }

    @Override
    public int findParkingSpot(Vehicle vehicle) {
        for (ParkingSpot parkingSpot : psList) {
            if (parkingSpot.vehicleType.equals(VehicleType.FOUR_WHEELER) && parkingSpot.isEmpty) {
                return parkingSpot.spotId;
            }
        }
        return -1;
    }
}

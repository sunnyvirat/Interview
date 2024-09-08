package com.abb.demoCRUD.ParkingLot;
import java.util.List;
public class TwoWheelerManager extends PSManager{
    public TwoWheelerManager(List<ParkingSpot> psList) {
        super(psList);
    }

    @Override
    public int findParkingSpot(Vehicle vehicle)
    {
        for (ParkingSpot parkingSpot : psList) {
            if (parkingSpot.vehicleType.equals(VehicleType.TWO_WHEELER) && parkingSpot.isEmpty) {
                return parkingSpot.spotId;
            }
        }
        return -1;
    }
}

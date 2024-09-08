package com.abb.demoCRUD.ParkingLot;

import java.util.List;

public class PSManagerFactory {
    PSManager manager;
    Vehicle vehicle;
    public PSManager getManager(Vehicle vehicle, List<ParkingSpot> psList)
    {
        return switch(vehicle.type)
        {
            case TWO_WHEELER -> new TwoWheelerManager(psList);
            case FOUR_WHEELER -> new FourWheelerManager(psList);
        };
    }
}

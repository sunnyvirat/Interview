package com.abb.demoCRUD.ParkingLot;

import java.util.List;
import java.util.Random;

public class EntryGate {
    Ticket ticket;
    PSManagerFactory managerFactory;
    public EntryGate(PSManagerFactory managerFactory)
    {
        this.managerFactory = managerFactory;
    }
    public Ticket generateTicket(Vehicle vehicle, List<ParkingSpot> parkingSpotList)
    {
        this.ticket = new Ticket(vehicle, this.findParkingSpace(vehicle, parkingSpotList));
        return this.ticket;
    }
    public int findParkingSpace(Vehicle vehicle, List<ParkingSpot> parkingSpotList)
    {
        return this.managerFactory.getManager(vehicle, parkingSpotList).findParkingSpot(vehicle);
    }
}

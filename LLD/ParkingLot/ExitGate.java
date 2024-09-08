package com.abb.demoCRUD.ParkingLot;

import java.time.LocalDateTime;

public class ExitGate {
    PSManager manager;
    Ticket ticket;
    public ExitGate(PSManager manager, Ticket ticket)
    {
        this.ticket = ticket;
        this.manager = manager;
    }
    public void setEndTime()
    {
        this.ticket.endTime = LocalDateTime.now();
    }
    public boolean removeVehicle()
    {
        return this.manager.removeVehicle(ticket.spotId);
    }
    public int calculateAmount()
    {
        ParkingSpot parkingSpot = manager.psList.get(this.ticket.spotId);
        return parkingSpot.basePrice*(this.ticket.endTime.getHour()- this.ticket.startTime.getHour());
    }
}

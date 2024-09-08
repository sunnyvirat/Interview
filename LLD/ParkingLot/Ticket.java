package com.abb.demoCRUD.ParkingLot;

import java.time.LocalDateTime;
import java.util.Random;

public class Ticket {
    int ticketId;
    LocalDateTime startTime;
    LocalDateTime endTime;
    Vehicle vehicle;
    public int spotId;
    Random random = new Random();
    public Ticket(Vehicle vehicle, int spotId)
    {
        this.ticketId = random.nextInt(1,100);
        this.startTime = LocalDateTime.now();
        this.vehicle = vehicle;
        this.spotId = spotId;
    }
    public int getTicketId()
    {
        return this.ticketId;
    }
    public void setEndTime(LocalDateTime endTime)
    {
        this.endTime = endTime;
    }
}

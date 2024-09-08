package com.abb.demoCRUD.ParkingLot;

public class ParkingSpot {
    int spotId;
    boolean isEmpty;
    VehicleType vehicleType;
    int basePrice;
    public ParkingSpot(int spotId, boolean isEmpty, VehicleType vehicleType, int basePrice)
    {
        this.spotId = spotId;
        this.isEmpty = isEmpty;
        this.vehicleType = vehicleType;
        this.basePrice = basePrice;
    }
    public VehicleType getVehicleType()
    {
        return this.vehicleType;
    }
    public int getBasePrice()
    {
        return this.basePrice;
    }
    public int getParkingSpot()
    {
        return this.spotId;
    }
    public void parkVehicle()
    {
        this.isEmpty = false;
    }
    public void removeVehicle()
    {
        this.isEmpty = true;
    }
}

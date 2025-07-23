package com.example.parkingLotDesign.Startergies;

import com.example.parkingLotDesign.Entities.ParkingFloor;
import com.example.parkingLotDesign.Entities.ParkingLot;
import com.example.parkingLotDesign.Entities.Vehicle;

public interface FloorStratergy {
    public ParkingFloor findFloor(ParkingLot parkingLot , Vehicle vehicle);
}

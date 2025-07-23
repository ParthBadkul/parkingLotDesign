package com.example.parkingLotDesign.Startergies;

import com.example.parkingLotDesign.Entities.ParkingFloor;
import com.example.parkingLotDesign.Entities.ParkingSpot;
import com.example.parkingLotDesign.Entities.Vehicle;
import com.example.parkingLotDesign.Enums.ParkingSpotType;
import com.example.parkingLotDesign.Enums.VehicleType;

public interface SpotStratergy {

   Boolean isCompatibe(ParkingSpotType spotType, VehicleType vehicleType);
   public ParkingSpot findParkingSpot(ParkingFloor parkingFloor , Vehicle vehicle);
}

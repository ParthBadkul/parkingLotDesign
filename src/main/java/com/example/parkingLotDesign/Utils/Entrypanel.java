package com.example.parkingLotDesign.Utils;

import com.example.parkingLotDesign.Entities.ParkingFloor;
import com.example.parkingLotDesign.Entities.ParkingLot;
import com.example.parkingLotDesign.Entities.ParkingSpot;
import com.example.parkingLotDesign.Entities.Vehicle;
import com.example.parkingLotDesign.Repos.ParkingSpotRepo;
import com.example.parkingLotDesign.Startergies.FloorStratergy;
import com.example.parkingLotDesign.Startergies.SpotStratergy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.security.PublicKey;

@Component
public class Entrypanel {


    @Autowired
    FloorStratergy floorStratergy;

    @Autowired
    SpotStratergy spotStratergy;

    @Autowired
    ParkingSpotRepo parkingSpotRepo;


    public String parkVehicle(ParkingLot parkingLot, Vehicle vehicle){

        ParkingFloor parkingFloor = floorStratergy.findFloor(parkingLot ,vehicle);

        ParkingSpot parkingSpot = spotStratergy.findParkingSpot(parkingFloor ,vehicle);

        parkingSpot.setVehicle(vehicle);
        parkingSpot.setIsOccupied(true);

       return parkingSpotRepo.save(parkingSpot).toString();

    }


}

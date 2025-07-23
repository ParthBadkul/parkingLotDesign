package com.example.parkingLotDesign.Utils;

import com.example.parkingLotDesign.Entities.ParkingFloor;
import com.example.parkingLotDesign.Entities.ParkingLot;
import com.example.parkingLotDesign.Entities.ParkingSpot;
import com.example.parkingLotDesign.Entities.ParkingTicket;
import com.example.parkingLotDesign.Entities.Vehicle;
import com.example.parkingLotDesign.Repos.ParkingSpotRepo;
import com.example.parkingLotDesign.Repos.ParkingTicketRepo;
import com.example.parkingLotDesign.Startergies.FloorStratergy;
import com.example.parkingLotDesign.Startergies.SpotStratergy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.time.LocalDateTime;

@Component
public class Entrypanel {


    @Autowired
    FloorStratergy floorStratergy;

    @Autowired
    SpotStratergy spotStratergy;

    @Autowired
    ParkingSpotRepo parkingSpotRepo;

    @Autowired
    ParkingTicketRepo parkingTicketRepo;


    public ParkingTicket parkVehicle(ParkingLot parkingLot, Vehicle vehicle){

        ParkingFloor parkingFloor = floorStratergy.findFloor(parkingLot ,vehicle);

        ParkingSpot parkingSpot = spotStratergy.findParkingSpot(parkingFloor ,vehicle);

        parkingSpot.setVehicle(vehicle);
        parkingSpot.setIsOccupied(true);

        ParkingTicket parkingTicket = new ParkingTicket();
        parkingTicket.setVehicle(vehicle);
        parkingTicket.setParkingSpot(parkingSpot);
        parkingTicket.setInTime(LocalDateTime.now());
        parkingTicketRepo.save(parkingTicket);

        return parkingTicket;

    }


}

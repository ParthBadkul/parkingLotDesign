package com.example.parkingLotDesign.Utils;

import com.example.parkingLotDesign.Entities.ParkingSpot;
import com.example.parkingLotDesign.Entities.ParkingTicket;
import com.example.parkingLotDesign.Repos.ParkingSpotRepo;
import com.example.parkingLotDesign.Repos.ParkingTicketRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ExitPanel {


    @Autowired
    private ParkingSpotRepo parkingSpotRepo;

    @Autowired
    private ParkingTicketRepo parkingTicketRepo;

    public ParkingSpot unParkVehicle(Long id){

        ParkingTicket parkingTicket = parkingTicketRepo.getById(id);

        ParkingSpot parkingSpot = parkingTicket.getParkingSpot();

        parkingSpot.setVehicle(null);
        parkingSpot.setIsOccupied(false);

        parkingTicket.setParkingSpot(null);

         parkingTicketRepo.save(parkingTicket);

         return parkingSpot;

    }


}

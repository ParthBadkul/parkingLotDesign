package com.example.parkingLotDesign.Services;

import com.example.parkingLotDesign.Entities.ParkingLot;
import com.example.parkingLotDesign.Entities.ParkingSpot;
import com.example.parkingLotDesign.Entities.ParkingTicket;
import com.example.parkingLotDesign.Entities.Vehicle;
import com.example.parkingLotDesign.Repos.ParkingLotRepo;
import com.example.parkingLotDesign.Repos.VehicleRepo;
import com.example.parkingLotDesign.Utils.Entrypanel;
import com.example.parkingLotDesign.Utils.ExitPanel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.PublicKey;
import java.util.Optional;

@Service
public class VehicleService {

    @Autowired
    private Entrypanel entrypanel;

    @Autowired
    private ExitPanel exitPanel;

    @Autowired
    private VehicleRepo vehicleRepo;// jes

    @Autowired
    private ParkingLotRepo parkingLotRepo;


    public ParkingTicket parkVehicle(Long id , Vehicle vehicle){
        Optional<ParkingLot> p = parkingLotRepo.findById(id);
        ParkingLot parkingLot1 = p.get();

        return entrypanel.parkVehicle(parkingLot1,vehicle);


    }

    public ParkingSpot unParkVehicle(Long parkingTicket){

        return exitPanel.unParkVehicle(parkingTicket);

    }




}

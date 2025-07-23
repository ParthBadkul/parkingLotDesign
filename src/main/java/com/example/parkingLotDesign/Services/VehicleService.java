package com.example.parkingLotDesign.Services;

import com.example.parkingLotDesign.Entities.ParkingLot;
import com.example.parkingLotDesign.Entities.Vehicle;
import com.example.parkingLotDesign.Repos.ParkingLotRepo;
import com.example.parkingLotDesign.Repos.VehicleRepo;
import com.example.parkingLotDesign.Utils.Entrypanel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class VehicleService {

    @Autowired
    private Entrypanel entrypanel;

    @Autowired
    private VehicleRepo vehicleRepo;

    @Autowired
    private ParkingLotRepo parkingLotRepo;


    public Object parkVehicle(Long id , Vehicle vehicle){
        Optional<ParkingLot> p = parkingLotRepo.findById(id);
        ParkingLot parkingLot1 = p.get();

        return entrypanel.parkVehicle(parkingLot1,vehicle);


    }



}

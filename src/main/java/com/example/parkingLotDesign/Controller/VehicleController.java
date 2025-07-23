package com.example.parkingLotDesign.Controller;

import com.example.parkingLotDesign.Entities.ParkingSpot;
import com.example.parkingLotDesign.Entities.ParkingTicket;
import com.example.parkingLotDesign.Entities.Vehicle;
import com.example.parkingLotDesign.Services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VehicleController {

    @Autowired
  private   VehicleService vehicleService;

    @PostMapping("/{id}/park")
    public ParkingTicket parkVehicle(@PathVariable Long id, @RequestBody Vehicle vehicle){

        return vehicleService.parkVehicle(id, vehicle);

    }



}

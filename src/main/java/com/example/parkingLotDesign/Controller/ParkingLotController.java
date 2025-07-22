package com.example.parkingLotDesign.Controller;

import com.example.parkingLotDesign.Entities.ParkingFloor;
import com.example.parkingLotDesign.Entities.ParkingLot;
import com.example.parkingLotDesign.Services.ParkingLotServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ParkingLotController {

    @Autowired
    private ParkingLotServices parkingLotServices;


    @PostMapping("/parkingLot")
    public ParkingLot createParkingLot(@RequestBody ParkingLot parkingLot){
        return parkingLotServices.createParkingLot(parkingLot);
    }

    @PostMapping("/{id}/createFloors")
    public ParkingLot createParkingFloor(@PathVariable Long id , @RequestBody List<ParkingFloor> parkingFloorList){

            return parkingLotServices.createParkingFloors(id, parkingFloorList );

    }



}

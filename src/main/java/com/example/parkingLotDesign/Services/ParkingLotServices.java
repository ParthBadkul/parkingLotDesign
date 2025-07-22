package com.example.parkingLotDesign.Services;

import com.example.parkingLotDesign.Entities.ParkingFloor;
import com.example.parkingLotDesign.Entities.ParkingLot;
import com.example.parkingLotDesign.Repos.ParkingFloorRepo;
import com.example.parkingLotDesign.Repos.ParkingLotRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class ParkingLotServices {

    @Autowired
    private ParkingLotRepo parkingLotRepo;

    @Autowired
    private ParkingFloorRepo parkingFloorRepo;


    public ParkingLot createParkingLot(ParkingLot parkingLot){


        return parkingLotRepo.save(parkingLot);


    }


    public ParkingLot createParkingFloors(Long id ,  List<ParkingFloor> parkingFloorList) {

       Optional<ParkingLot> p =  parkingLotRepo.findById(id);
       ParkingLot parkingLot = p.get();

       List<ParkingFloor> parkingFloorList1 = parkingLot.getParkingFloorList();

       parkingFloorList1.addAll(parkingFloorList);

       for(ParkingFloor parkingFloor : parkingFloorList1 ){
           parkingFloor.setParkingLot(parkingLot);
       }

       parkingLot.setParkingFloorList(parkingFloorList1);

        System.out.println(parkingLot.toString());

      return parkingLotRepo.save(parkingLot);

    }



}

package com.example.parkingLotDesign.Utils;


import com.example.parkingLotDesign.Entities.ParkingFloor;
import com.example.parkingLotDesign.Entities.ParkingLot;
import com.example.parkingLotDesign.Entities.ParkingSpot;
import com.example.parkingLotDesign.Entities.Vehicle;
import com.example.parkingLotDesign.Startergies.FloorStratergy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ParkingFloorStratergy  implements FloorStratergy {



    @Autowired
    private HelperFunctions helperFunctions;



    public ParkingFloor findFloor(ParkingLot parkingLot , Vehicle vehicle){

        List<ParkingFloor> parkingFloorList = parkingLot.getParkingFloorList();

        for(ParkingFloor parkingFloor : parkingFloorList){

            List<ParkingSpot> parkingSpots = parkingFloor.getParkingSpotList();
            if(parkingSpots!=null && helperFunctions.parkingSpotsAvailabe( parkingSpots , vehicle)){

             return parkingFloor;
            }

        }
        return null;
    }

}

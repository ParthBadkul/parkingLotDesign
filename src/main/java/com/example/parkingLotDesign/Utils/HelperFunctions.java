package com.example.parkingLotDesign.Utils;

import com.example.parkingLotDesign.Entities.ParkingSpot;
import com.example.parkingLotDesign.Entities.Vehicle;
import com.example.parkingLotDesign.Startergies.SpotStratergy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class HelperFunctions {

    @Autowired
    private SpotStratergy spotStratergy;

    public boolean parkingSpotsAvailabe(List<ParkingSpot> parkingSpots , Vehicle vehicle) {

        for(ParkingSpot p : parkingSpots){
            if(!p.getIsOccupied() && spotStratergy.isCompatibe(p.getParkingSpotType() ,vehicle.getVehicleType())){
                return true;
            }
        }

        return false;
    }
}

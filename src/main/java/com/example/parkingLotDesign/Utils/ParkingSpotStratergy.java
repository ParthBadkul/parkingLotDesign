package com.example.parkingLotDesign.Utils;

import com.example.parkingLotDesign.Entities.ParkingFloor;
import com.example.parkingLotDesign.Entities.ParkingSpot;
import com.example.parkingLotDesign.Entities.Vehicle;
import com.example.parkingLotDesign.Enums.ParkingSpotType;
import com.example.parkingLotDesign.Enums.VehicleType;
import com.example.parkingLotDesign.Startergies.SpotStratergy;
import org.springframework.stereotype.Component;

@Component
public class ParkingSpotStratergy implements SpotStratergy {


    @Override
   public ParkingSpot findParkingSpot(ParkingFloor parkingFloor , Vehicle vehicle){

       if(parkingFloor == null){
           return null;
       }



       for(ParkingSpot spot : parkingFloor.getParkingSpotList()){


           if(spot.getIsOccupied()){
               continue;
           }

           ParkingSpotType spotType = spot.getParkingSpotType();
           VehicleType vehicleType = vehicle.getVehicleType();

           if(isCompatibe(spotType , vehicleType)){
               return spot;
           }


       }

       return null;
   }

   @Override
   public Boolean isCompatibe(ParkingSpotType spotType, VehicleType vehicleType) {

       return switch (vehicleType){
           case CAR , MotorCycle->  true;
           case  BUS -> spotType == ParkingSpotType.MEDIUM || spotType == ParkingSpotType.LARGE;
           case Truck -> spotType == ParkingSpotType.LARGE;
           case HeavyVehicles -> false;

       };



    }


}

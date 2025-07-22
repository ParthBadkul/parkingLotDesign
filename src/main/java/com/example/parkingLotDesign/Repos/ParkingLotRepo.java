package com.example.parkingLotDesign.Repos;

import com.example.parkingLotDesign.Entities.ParkingLot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkingLotRepo extends JpaRepository< ParkingLot,Long> {


}

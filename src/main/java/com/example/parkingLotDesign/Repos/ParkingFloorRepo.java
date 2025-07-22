package com.example.parkingLotDesign.Repos;

import com.example.parkingLotDesign.Entities.ParkingFloor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkingFloorRepo extends JpaRepository< ParkingFloor,Long > {
}

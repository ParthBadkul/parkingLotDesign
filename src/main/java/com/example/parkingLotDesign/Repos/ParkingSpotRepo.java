package com.example.parkingLotDesign.Repos;

import com.example.parkingLotDesign.Entities.ParkingSpot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkingSpotRepo extends JpaRepository< ParkingSpot,Long> {
}

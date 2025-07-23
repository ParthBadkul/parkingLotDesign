package com.example.parkingLotDesign.Repos;

import com.example.parkingLotDesign.Entities.ParkingTicket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkingTicketRepo extends JpaRepository<ParkingTicket,Long> {
}

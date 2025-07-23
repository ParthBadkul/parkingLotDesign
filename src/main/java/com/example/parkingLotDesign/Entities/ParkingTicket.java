package com.example.parkingLotDesign.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Cascade;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class ParkingTicket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private LocalDateTime inTime;

    @OneToOne(cascade = CascadeType.ALL)
    private Vehicle vehicle;

    @OneToOne(cascade = CascadeType.ALL)
    private ParkingSpot parkingSpot;

    public ParkingTicket(){

    }




}

package com.example.parkingLotDesign.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class ParkingLot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long parkingLotId;

    private String name;

    @OneToMany(mappedBy = "parkingLot" , cascade = CascadeType.ALL)
    private List<ParkingFloor> parkingFloorList;


    public ParkingLot(String name, List<ParkingFloor> parkingFloorList) {
        this.name = name;
        this.parkingFloorList = parkingFloorList;
    }

    public ParkingLot(){}


}

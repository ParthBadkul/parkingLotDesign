package com.example.parkingLotDesign.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Cascade;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class ParkingFloor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long FloorId;

    private String floorName;

    @OneToMany(mappedBy = "parkingFloorId" ,cascade = CascadeType.ALL)

    private List<ParkingSpot> parkingSpotList;

    @ManyToOne
    @JsonIgnore
    private ParkingLot parkingLot;

    public ParkingFloor(List<ParkingSpot> parkingSpotList) {
        this.parkingSpotList = parkingSpotList;

    }

    public ParkingFloor() {
        this.parkingSpotList = new ArrayList<>();
    }
}

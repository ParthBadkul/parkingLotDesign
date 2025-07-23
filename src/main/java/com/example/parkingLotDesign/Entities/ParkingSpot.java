package com.example.parkingLotDesign.Entities;

import com.example.parkingLotDesign.Enums.ParkingSpotType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ParkingSpot {
      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      private Long Id;

      @Enumerated(EnumType.STRING)
      private ParkingSpotType parkingSpotType;

      private Boolean isOccupied;

      @ManyToOne
      @JsonIgnore
      private ParkingFloor parkingFloorId;

      @OneToOne
      @JoinColumn(name = "vehicle_id")
      private Vehicle vehicle;


}

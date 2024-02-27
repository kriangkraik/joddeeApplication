package com.joddee.joddee.entitys;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Car")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long carId;
    private Long ownerId;

    @Column(nullable=false, length = 25)
    private String plateNo;

    @Column(nullable=false, length = 25)
    private String color;

    @Column(nullable=false, length = 25)
    private String brand;

    @Column(nullable=false, length = 25)
    private String model;

    @Column(nullable=false, length = 255)
    private String detail;

}

package com.joddee.joddee.entitys;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name= "LevelPark")
public class LevelPark {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long levelParkId;

    @Column(nullable=false, length = 25)
    private String name;
}

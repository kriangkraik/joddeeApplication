package com.joddee.joddee.entitys;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="Park")
public class Park {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long parkId;

    private Long idTypePark;

    private String name;

    private boolean isActive;
}

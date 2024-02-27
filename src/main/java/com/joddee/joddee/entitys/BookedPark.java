package com.joddee.joddee.entitys;

import java.util.Date;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="BookedPark")
public class BookedPark {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookparkId;

    private Long idCus;

    private Long idPark;

    private Long idLevelPark;

    private Date bookStartDateTime;

    private Date bookEndDateTime;
}

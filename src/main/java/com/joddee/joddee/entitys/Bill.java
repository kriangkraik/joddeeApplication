package com.joddee.joddee.entitys;

import java.util.Date;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Bill")
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long billId;

    @Column(nullable=false)
    private Long idEmp;

    @Column(nullable=false)
    private Long idCus;

    @Column(nullable=false)
    private Long idCar;

    @Column(nullable=false)
    private Date created;

    @Column(nullable=false)
    private Date updated;

    @Column(nullable=false)
    private Double amount;
}

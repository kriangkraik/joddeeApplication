package com.joddee.joddee.entitys;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name= "Owner")
public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ownerId;

    private Long typeOwnerId;

    @Column(nullable=false, length = 25)
    private String firstName;

    @Column(nullable=false, length = 25)
    private String lastName;

    @Column(nullable=false, length = 25)
    private String address;

    @Column(nullable=false, length = 25)
    private String phone;

    @Column(nullable=false, length = 25)
    private String email;
}

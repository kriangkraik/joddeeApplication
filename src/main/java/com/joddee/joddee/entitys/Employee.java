package com.joddee.joddee.entitys;

import java.util.Date;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="Employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long empId;

    @Column(nullable=false, length = 50)
    private String firstName;

    @Column(nullable=false, length = 50)
    private String lastName;

    @Column(nullable=false, length = 50)
    private String email;

    @Column(nullable=false, length = 50)
    private String phoneNo;

    @Column(nullable=true, length = 50)
    private String middleName;

    @Column(nullable=false, length = 20)
    private String title;

    @Column(nullable=false, length = 13)
    private String idNumber;

    @Column(nullable=false, length = 20)
    private String gender;

    @Column(nullable=true, length = 20)
    private String driverLicence;

    @Column(nullable=false, length = 50)
    private String race;

    @Column(nullable=false, length = 50)
    private String nationality;

    @Column(nullable=false, length = 50)
    private String religion;

    @Column(nullable=false)
    private Date dateOfBirth;

    @Column(nullable=false)
    private int age;

    @Column(nullable=false)
    private int weight;

    @Column(nullable=false)
    private int height;
}

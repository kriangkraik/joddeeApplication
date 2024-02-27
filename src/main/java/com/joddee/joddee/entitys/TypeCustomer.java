package com.joddee.joddee.entitys;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class TypeCustomer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long typeCusId;

    private String name;
}

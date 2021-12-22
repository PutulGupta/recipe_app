package com.example.recepie.recepieapp.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class UnitOfMeasure {

    @Id
    @GeneratedValue
    private Long id;
    private String description;
}

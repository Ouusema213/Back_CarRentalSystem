package com.example.Car_Rentel_Spring.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "cars")
@Data
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String brand;

    private String color;

    private String name ;

    private  String type;

    private String transmission ;

    private String description ;

    private Long price;

    private Date year;

    @Column(columnDefinition = "longblob")
    private byte[] image;
}

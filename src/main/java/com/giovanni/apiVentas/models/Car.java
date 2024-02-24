package com.giovanni.apiVentas.models;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "autos")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "marca")
    private String brand;

    @Column(name = "modelo")
    private String model;

    @Column(name = "color")
    private String color;

    @Column(name = "año")
    private Long anio;
}

package ru.mtuci.Popova_Practica.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity
public class licenseType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Integer defaultDuration;

    private String description;

    @OneToMany(mappedBy = "licenseType")
    private List<license> licenses;

}
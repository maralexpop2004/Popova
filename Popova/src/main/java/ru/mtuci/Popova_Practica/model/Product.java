package ru.mtuci.Popova_Practica.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Boolean isBlocked;

    @OneToMany(mappedBy = "product")
    private List<license> licenses;

}
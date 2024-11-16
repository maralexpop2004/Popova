package ru.mtuci.Popova_Practica.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@Entity
public class licenseHistory {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "license_id")
    private license license;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private ApplicationUser user;

    private String status;

    private Date changeDate;

    private String description;

}
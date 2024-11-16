package ru.mtuci.Popova_Practica.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Setter
@Getter
@Entity
public class license {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String code;


    @ManyToOne
    @JoinColumn(name = "user_id")
    private ApplicationUser user;


    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;


    @ManyToOne
    @JoinColumn(name = "type_id")
    private licenseType licenseType;
    @ManyToOne
    @JoinColumn(name = "owner_id")
    private ApplicationUser owner;


    private Date firstActivationDate;

    private Date endingDate;

    private Boolean blocked;

    private Integer deviceCount;

    private Long duration;
    private String description;

    @OneToMany(mappedBy = "license")
    private List<Devicelicense> deviceLicenses;

    @OneToMany(mappedBy = "license")
    private List<licenseHistory> licenseHistory;

}
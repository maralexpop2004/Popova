package ru.mtuci.Popova_Practica.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class licenseType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Integer defaultDuration;
    private String description;

    @OneToMany(mappedBy = "licenseType")
    private List<license> licenses;  // Изменено на License с заглавной буквы

    // Геттер для id
    public Long getId() {
        return id;
    }

    // Сеттер для id
    public void setId(Long id) {
        this.id = id;
    }

    // Геттер для name
    public String getName() {
        return name;
    }

    // Сеттер для name
    public void setName(String name) {
        this.name = name;
    }

    // Геттер для defaultDuration
    public Integer getDefaultDuration() {
        return defaultDuration;
    }

    // Сеттер для defaultDuration
    public void setDefaultDuration(Integer defaultDuration) {
        this.defaultDuration = defaultDuration;
    }

    // Геттер для description
    public String getDescription() {
        return description;
    }

    // Сеттер для description
    public void setDescription(String description) {
        this.description = description;
    }

    // Геттер для licenses
    public List<license> getLicenses() {
        return licenses;
    }

    // Сеттер для licenses
    public void setLicenses(List<license> licenses) {
        this.licenses = licenses;
    }
}
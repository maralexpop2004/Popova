package ru.mtuci.Popova_Practica.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Boolean isBlocked;

    @OneToMany(mappedBy = "product")
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

    // Геттер для isBlocked
    public Boolean getIsBlocked() {
        return isBlocked;
    }

    // Сеттер для isBlocked
    public void setIsBlocked(Boolean isBlocked) {
        this.isBlocked = isBlocked;
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
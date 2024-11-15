package ru.mtuci.Popova_Practica.model;

import jakarta.persistence.*;
import org.apache.catalina.User;

import java.util.Date;

@Entity
public class licenseHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "license_id")
    private license license;  // Изменено на License с заглавной буквы

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private String status;
    private Date changeDate;
    private String description;

    // Геттер для id
    public Long getId() {
        return id;
    }

    // Сеттер для id
    public void setId(Long id) {
        this.id = id;
    }

    // Геттер для license
    public license getLicense() {
        return license;
    }

    // Сеттер для license
    public void setLicense(license license) {
        this.license = license;
    }

    // Геттер для user
    public User getUser() {
        return user;
    }

    // Сеттер для user
    public void setUser(User user) {
        this.user = user;
    }

    // Геттер для status
    public String getStatus() {
        return status;
    }

    // Сеттер для status
    public void setStatus(String status) {
        this.status = status;
    }

    // Геттер для changeDate
    public Date getChangeDate() {
        return changeDate;
    }

    // Сеттер для changeDate
    public void setChangeDate(Date changeDate) {
        this.changeDate = changeDate;
    }

    // Геттер для description
    public String getDescription() {
        return description;
    }

    // Сеттер для description
    public void setDescription(String description) {
        this.description = description;
    }
}
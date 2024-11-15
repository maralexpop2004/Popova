package ru.mtuci.Popova_Practica.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Devicelicense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "license_id")
    private license license;  // Изменено на License с заглавной буквы

    @ManyToOne
    @JoinColumn(name = "device_id")
    private Device device;

    private Date activationDate;

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

    // Геттер для device
    public Device getDevice() {
        return device;
    }

    // Сеттер для device
    public void setDevice(Device device) {
        this.device = device;
    }

    // Геттер для activationDate
    public Date getActivationDate() {
        return activationDate;
    }

    // Сеттер для activationDate
    public void setActivationDate(Date activationDate) {
        this.activationDate = activationDate;
    }
}
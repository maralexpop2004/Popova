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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public license getLicense() {
        return license;
    }

    public void setLicense(license license) {
        this.license = license;
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public Date getActivationDate() {
        return activationDate;
    }

    public void setActivationDate(Date activationDate) {
        this.activationDate = activationDate;
    }
}
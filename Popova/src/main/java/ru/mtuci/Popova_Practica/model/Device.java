package ru.mtuci.Popova_Practica.model;

import jakarta.persistence.*;
import org.apache.catalina.User;

import java.util.Date;
import java.util.List;

@Entity
public class Device {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String macAddress;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "device")
    private List<Devicelicense> deviceLicenses;

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

    // Геттер для macAddress
    public String getMacAddress() {
        return macAddress;
    }

    // Сеттер для macAddress
    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    // Геттер для user
    public User getUser() {
        return user;
    }

    // Сеттер для user
    public void setUser(User user) {
        this.user = user;
    }

    // Геттер для deviceLicenses
    public List<Devicelicense> getDeviceLicenses() {
        return deviceLicenses;
    }

    // Сеттер для deviceLicenses
    public void setDeviceLicenses(List<Devicelicense> deviceLicenses) {
        this.deviceLicenses = deviceLicenses;
    }
}
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

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getMacAddress() {
        return macAddress;
    }
    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public List<Devicelicense> getDeviceLicenses() {
        return deviceLicenses;
    }
    public void setDeviceLicenses(List<Devicelicense> deviceLicenses) {
        this.deviceLicenses = deviceLicenses;
    }
}
package ru.mtuci.Popova_Practica.model;

import jakarta.persistence.*;
import org.apache.catalina.User;

import java.util.Date;
import java.util.List;

@Entity
public class license {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String code;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "type_id")
    private licenseType licenseType;  // Изменено на LicenseType с заглавной буквы

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private User owner;

    private Date firstActivationDate;
    private Date endingDate;
    private Boolean blocked;
    private Integer deviceCount;
    private Long duration;
    private String description;

    @OneToMany(mappedBy = "license")
    private List<Devicelicense> deviceLicenses;  // Изменено на DeviceLicense с заглавной буквы

    @OneToMany(mappedBy = "license")
    private List<licenseHistory> licenseHistory;  // Изменено на LicenseHistory с заглавной буквы

    // Геттер для id
    public Long getId() {
        return id;
    }

    // Сеттер для id
    public void setId(Long id) {
        this.id = id;
    }

    // Геттер для code
    public String getCode() {
        return code;
    }

    // Сеттер для code
    public void setCode(String code) {
        this.code = code;
    }

    // Геттер для user
    public User getUser() {
        return user;
    }

    // Сеттер для user
    public void setUser(User user) {
        this.user = user;
    }

    // Геттер для product
    public Product getProduct() {
        return product;
    }

    // Сеттер для product
    public void setProduct(Product product) {
        this.product = product;
    }

    // Геттер для licenseType
    public licenseType getLicenseType() {
        return licenseType;
    }

    // Сеттер для licenseType
    public void setLicenseType(licenseType licenseType) {
        this.licenseType = licenseType;
    }

    // Геттер для owner
    public User getOwner() {
        return owner;
    }

    // Сеттер для owner
    public void setOwner(User owner) {
        this.owner = owner;
    }

    // Геттер для firstActivationDate
    public Date getFirstActivationDate() {
        return firstActivationDate;
    }

    // Сеттер для firstActivationDate
    public void setFirstActivationDate(Date firstActivationDate) {
        this.firstActivationDate = firstActivationDate;
    }

    // Геттер для endingDate
    public Date getEndingDate() {
        return endingDate;
    }

    // Сеттер для endingDate
    public void setEndingDate(Date endingDate) {
        this.endingDate = endingDate;
    }

    // Геттер для blocked
    public Boolean getBlocked() {
        return blocked;
    }

    // Сеттер для blocked
    public void setBlocked(Boolean blocked) {
        this.blocked = blocked;
    }

    // Геттер для deviceCount
    public Integer getDeviceCount() {
        return deviceCount;
    }

    // Сеттер для deviceCount
    public void setDeviceCount(Integer deviceCount) {
        this.deviceCount = deviceCount;
    }

    // Геттер для duration
    public Long getDuration() {
        return duration;
    }

    // Сеттер для duration
    public void setDuration(Long duration) {
        this.duration = duration;
    }

    // Геттер для description
    public String getDescription() {
        return description;
    }

    // Сеттер для description
    public void setDescription(String description) {
        this.description = description;
    }

    // Геттер для deviceLicenses
    public List<Devicelicense> getDeviceLicenses() {
        return deviceLicenses;
    }

    // Сеттер для deviceLicenses
    public void setDeviceLicenses(List<Devicelicense> deviceLicenses) {
        this.deviceLicenses = deviceLicenses;
    }

    // Геттер для licenseHistory
    public List<licenseHistory> getLicenseHistory() {
        return licenseHistory;
    }

    // Сеттер для licenseHistory
    public void setLicenseHistory(List<licenseHistory> licenseHistory) {
        this.licenseHistory = licenseHistory;
    }
}
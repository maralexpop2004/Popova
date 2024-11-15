package ru.mtuci.Popova_Practica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.mtuci.Popova_Practica.model.licenseType;  // Изменено на LicenseType с заглавной буквы

public interface licenseTypeRepository extends JpaRepository<licenseType, Long> {
}
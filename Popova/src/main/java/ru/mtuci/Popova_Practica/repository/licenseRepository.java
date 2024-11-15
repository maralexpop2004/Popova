package ru.mtuci.Popova_Practica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.mtuci.Popova_Practica.model.license;  // Изменено на License с заглавной буквы

public interface licenseRepository extends JpaRepository<license, Long> {
    // Здесь вы можете добавить свои пользовательские методы, если это необходимо
}
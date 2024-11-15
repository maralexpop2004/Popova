package ru.mtuci.Popova_Practica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.mtuci.Popova_Practica.model.Devicelicense;

public interface DevicelicenseRepository extends JpaRepository<Devicelicense, Long> {
    // Здесь вы можете добавить свои пользовательские методы, если это необходимо
}
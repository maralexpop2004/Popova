package ru.mtuci.Popova_Practica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.mtuci.Popova_Practica.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
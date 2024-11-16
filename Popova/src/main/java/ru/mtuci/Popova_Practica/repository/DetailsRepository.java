package ru.mtuci.Popova_Practica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.mtuci.Popova_Practica.model.Details;

@Repository
public interface DetailsRepository extends JpaRepository<Details, Long> {
}

package ru.mtuci.Popova_Practica.service;

import ru.mtuci.Popova_Practica.model.Demo;
import java.util.List;

public interface DemoService {
    void save(Demo demo);
    List<Demo> findAll();
    Demo findById(long id);
}


package ru.mtuci.Popova_Practica.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
@Getter
@AllArgsConstructor
public enum Permission {
    READ("read"),
    MODIFICATION("modification");
    private final String permission;
}

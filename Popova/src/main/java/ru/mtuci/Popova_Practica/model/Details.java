package ru.mtuci.Popova_Practica.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.mtuci.Popova_Practica.model.Demo;

@Entity
@Table(name = "details")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Details {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "address")
    private String address;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "demo_id", referencedColumnName = "id")
    @JsonIgnoreProperties("details")
    private Demo demo;
}

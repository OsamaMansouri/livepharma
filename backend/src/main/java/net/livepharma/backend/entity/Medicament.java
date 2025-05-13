package net.livepharma.backend.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name ="medicaments")

public class Medicament {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name ="nommedic")
    private String nommedic;
    @Column(name ="fabriquant")
    private String fabriquant;
    @Column(name ="dateProduction")
    private LocalDate dateProduction;
    @Column(name ="dateExpiration")
    private LocalDate dateExpiration;
    @Column(name ="informations")
    private String informations;

    // All-args constructor (except ID)

}
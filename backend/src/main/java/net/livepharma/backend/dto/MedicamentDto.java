package net.livepharma.backend.dto;
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

public class MedicamentDto {

    private int id;
    private String nommedic;
    private String fabriquant;
    private LocalDate dateProduction;
    private LocalDate dateExpiration;
    private String informations;

}



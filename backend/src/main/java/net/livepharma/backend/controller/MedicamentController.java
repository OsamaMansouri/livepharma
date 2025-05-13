package net.livepharma.backend.controller;

import lombok.AllArgsConstructor;
import net.livepharma.backend.dto.MedicamentDto;
import net.livepharma.backend.service.MedicamentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/medicaments")
@AllArgsConstructor
public class MedicamentController {

    private MedicamentService medicamentService;

    @PostMapping
    public ResponseEntity<MedicamentDto> createMedicament (@RequestBody MedicamentDto medicamentDto){
        MedicamentDto savedMedicament = medicamentService.createMedicament(medicamentDto);
        return new ResponseEntity<>(savedMedicament, HttpStatus.CREATED);
    }

}

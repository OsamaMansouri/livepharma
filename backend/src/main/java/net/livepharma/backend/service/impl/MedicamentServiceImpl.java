package net.livepharma.backend.service.impl;

import lombok.AllArgsConstructor;
import net.livepharma.backend.dto.MedicamentDto;
import net.livepharma.backend.entity.Medicament;
import net.livepharma.backend.mapper.MedicamentMapper;
import net.livepharma.backend.repository.MedicamentRepository;
import net.livepharma.backend.service.MedicamentService;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class MedicamentServiceImpl implements MedicamentService{

    private MedicamentRepository medicamentRepository;

    @Override
    public MedicamentDto createMedicament(MedicamentDto medicamentDto) {

        Medicament medicament = MedicamentMapper.mapToMedicament(medicamentDto);
        Medicament savedMedicament = (Medicament) medicamentRepository.save(medicament);

        return MedicamentMapper.mapToMedicamentDto(savedMedicament);
    }
}

package net.livepharma.backend.mapper;

import net.livepharma.backend.dto.MedicamentDto;
import net.livepharma.backend.entity.Medicament;

public class MedicamentMapper {

    public static MedicamentDto mapToMedicamentDto (Medicament medicament){
        return  new MedicamentDto(
                medicament.getId(),
                medicament.getNommedic(),
                medicament.getFabriquant(),
                medicament.getDateProduction(),
                medicament.getDateExpiration(),
                medicament.getInformations()
        );
    }

    public static Medicament mapToMedicament (MedicamentDto medicamentDto){

        return new Medicament(
                medicamentDto.getId(),
                medicamentDto.getNommedic(),
                medicamentDto.getFabriquant(),
                medicamentDto.getDateProduction(),
                medicamentDto.getDateExpiration(),
                medicamentDto.getInformations()
        );

    }

}

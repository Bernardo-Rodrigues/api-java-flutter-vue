package br.com.bernardorodrigues.api.models.mappers;

import br.com.bernardorodrigues.api.models.dtos.CepDto;
import br.com.bernardorodrigues.api.models.entities.Cep;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CepMapper {
    Cep dtoToEntity(CepDto dto);
    List<CepDto> entityListToDtoList(List<Cep> entityList);
}

package br.com.bernardorodrigues.api.services;

import br.com.bernardorodrigues.api.models.dtos.CepDto;

import java.util.List;

public interface CepService {

    CepDto save(String cep);
    List<CepDto> getAll();
}

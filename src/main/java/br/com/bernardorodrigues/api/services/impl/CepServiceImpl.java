package br.com.bernardorodrigues.api.services.impl;

import br.com.bernardorodrigues.api.models.dtos.CepDto;
import br.com.bernardorodrigues.api.models.mappers.CepMapper;
import br.com.bernardorodrigues.api.repositories.CepRepository;
import br.com.bernardorodrigues.api.services.CepService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import java.util.List;

@Service
public class CepServiceImpl implements CepService {

    @Autowired
    private CepMapper cepMapper;
    @Autowired
    private CepRepository cepRepository;

    @Override
    public CepDto save(String cep) {
        try {
            JSONObject response = Unirest.get("https://viacep.com.br/ws/35900411/json").asJson().getBody().getObject();
            CepDto dto = CepDto.builder()
                    .cep(response.get("cep").toString())
                    .logradouro(response.get("logradouro").toString())
                    .bairro(response.get("bairro").toString())
                    .localidade(response.get("localidade").toString())
                    .uf(response.get("uf").toString())
                    .build();

            cepRepository.save(cepMapper.dtoToEntity(dto));

            return dto;
        } catch (UnirestException e) {
            throw new Error("Error: " + e.getMessage());
        }
    }

    @Override
    public List<CepDto> getAll() {
        return cepMapper.entityListToDtoList(cepRepository.findAll());
    }
}

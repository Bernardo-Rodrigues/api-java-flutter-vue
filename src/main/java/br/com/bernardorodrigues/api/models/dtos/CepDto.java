package br.com.bernardorodrigues.api.models.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CepDto {
    String cep;
    String logradouro;
    String bairro;
    String localidade;
    String uf;
}

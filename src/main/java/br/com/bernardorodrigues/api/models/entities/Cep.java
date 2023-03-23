package br.com.bernardorodrigues.api.models.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ceps")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cep {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(unique = true)
    private String cep;
    private String logradouro;
    private String bairro;
    private String localidade;
    private String uf;
}

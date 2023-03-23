package br.com.bernardorodrigues.api.repositories;

import br.com.bernardorodrigues.api.models.entities.Cep;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CepRepository extends JpaRepository<Cep, Integer> {
}

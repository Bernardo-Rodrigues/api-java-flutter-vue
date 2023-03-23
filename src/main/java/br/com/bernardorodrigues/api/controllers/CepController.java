package br.com.bernardorodrigues.api.controllers;

import br.com.bernardorodrigues.api.models.dtos.CepDto;
import br.com.bernardorodrigues.api.models.requests.SaveCepRequest;
import br.com.bernardorodrigues.api.services.CepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ceps")
public class CepController {

    @Autowired
    private CepService cepService;

    @PostMapping
    public ResponseEntity<CepDto> saveCep(@RequestBody SaveCepRequest body) {
        CepDto cepDto = cepService.save(body.getCep());
        return ResponseEntity.ok().body(cepDto);
    }

    @GetMapping
    public ResponseEntity<List<CepDto>> getAll() {
        List<CepDto> cepDtoList = cepService.getAll();
        return ResponseEntity.ok().body(cepDtoList);
    }
}

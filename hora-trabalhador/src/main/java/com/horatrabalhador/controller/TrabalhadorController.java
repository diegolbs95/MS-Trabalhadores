package com.horatrabalhador.controller;

import com.horatrabalhador.model.Trabalhador;
import com.horatrabalhador.service.TrabalhadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/trabalhador")
public class TrabalhadorController {

    @Autowired
    private TrabalhadorService service;

    @GetMapping
    public ResponseEntity<?> listar (){
        return ResponseEntity.ok().body(service.todos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> buscaId(@PathVariable Long id){
        var funcionarioId = service.buscaId(id);
        return ResponseEntity.ok(funcionarioId);
    }

    @PostMapping
    public ResponseEntity<Trabalhador> adicionar (@RequestBody Trabalhador trabalhador){
        var funcionario = service.adicionar(trabalhador);
        return ResponseEntity.status(HttpStatus.CREATED).body(funcionario);
    }
}

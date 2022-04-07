package com.horatrabalhador.service;

import com.horatrabalhador.model.Trabalhador;
import com.horatrabalhador.repositorios.TrabalhadorRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrabalhadorService {

    @Autowired
    private TrabalhadorRepositorio repositorio;

    public List<Trabalhador> todos (){
        return repositorio.findAll();
    }

    public Trabalhador buscaId (Long id){
        var funcionarioId = repositorio.findById(id).get();
        return funcionarioId;
    }

    public Trabalhador adicionar (Trabalhador trabalhador){
        return repositorio.save(trabalhador);
    }
}

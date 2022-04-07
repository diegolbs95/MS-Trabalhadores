package com.horatrabalhador.repositorios;

import com.horatrabalhador.model.Trabalhador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrabalhadorRepositorio extends JpaRepository<Trabalhador, Long> {
}

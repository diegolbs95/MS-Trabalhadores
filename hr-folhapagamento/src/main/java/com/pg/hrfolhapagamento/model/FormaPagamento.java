package com.pg.hrfolhapagamento.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class FormaPagamento implements Serializable {

    private String nome;
    private Double rendaDiaria;
    private Integer dias;

    public double getTotal (){
        return dias * rendaDiaria;
    }
}

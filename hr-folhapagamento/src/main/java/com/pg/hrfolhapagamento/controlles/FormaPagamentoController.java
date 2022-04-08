package com.pg.hrfolhapagamento.controlles;

import com.pg.hrfolhapagamento.servico.FormaPagamentoServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/formapagamento")
public class FormaPagamentoController {

    @Autowired
    private FormaPagamentoServico servico;
}

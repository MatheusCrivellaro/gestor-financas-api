package br.com.matheuscrivellaro.gestorfinancasapi.controllers;

import br.com.matheuscrivellaro.gestorfinancasapi.dto.TransacaoDTO;
import br.com.matheuscrivellaro.gestorfinancasapi.service.TransacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class TransacaoController {

    @Autowired
    private TransacaoService service;

    @GetMapping
    public ResponseEntity<List<TransacaoDTO>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

}

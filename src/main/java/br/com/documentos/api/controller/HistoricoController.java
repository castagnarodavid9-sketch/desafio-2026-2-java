package br.com.documentos.api.controller;

import br.com.documentos.api.entity.Historico;
import br.com.documentos.api.repository.HistoricoRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/historico")
public class HistoricoController {
    private final HistoricoRepository repository;

    public HistoricoController (HistoricoRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Historico> listar(){
        return repository.findAll();
    }
}
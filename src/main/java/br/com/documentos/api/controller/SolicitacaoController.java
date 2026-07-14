package br.com.documentos.api.controller;

import br.com.documentos.api.entity.Solicitacao;
import br.com.documentos.api.repository.SolicitacaoRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/solicitacoes")
public class SolicitacaoController {
    private final SolicitacaoRepository repository;

    public SolicitacaoController (SolicitacaoRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Solicitacao> listar(){
        return repository.findAll();
    }
}
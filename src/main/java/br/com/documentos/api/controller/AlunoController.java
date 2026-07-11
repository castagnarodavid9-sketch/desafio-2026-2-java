package br.com.documentos.api.controller;

import br.com.documentos.api.entity.Aluno;
import br.com.documentos.api.repository.AlunoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
    private final AlunoRepository repository;

    public AlunoController(AlunoRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Aluno> listar(){
        return repository.findAll();
    }
}
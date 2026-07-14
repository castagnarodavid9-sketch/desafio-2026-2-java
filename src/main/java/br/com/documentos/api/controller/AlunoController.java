package br.com.documentos.api.controller;

import br.com.documentos.api.entity.Aluno;
import br.com.documentos.api.repository.AlunoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List; // Lista do java

@RestController // Diz que essa classe pode receber requisições HTTP (esse só controla a parte da API e não do design)
@RequestMapping("/alunos") // Define o endereço de base para requisição (localhost:8080/alunos)
public class AlunoController {
    private final AlunoRepository repository;

    public AlunoController(AlunoRepository repository) {
        this.repository = repository;
    }

    @GetMapping // Avisa que isso é uma requisição 'get'
    public List<Aluno> listar(){
        return repository.findAll();
    }
}
package br.com.documentos.api.controller;

import br.com.documentos.api.entity.Curso;
import br.com.documentos.api.repository.CursoRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoController {
    private final CursoRepository repository;

    public CursoController (CursoRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Curso> listar(){
        return repository.findAll();
    }
}

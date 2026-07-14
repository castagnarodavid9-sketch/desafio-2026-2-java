package br.com.documentos.api.controller;

import br.com.documentos.api.entity.Curso;
import br.com.documentos.api.repository.CursoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/cursos")
public class CursoViewController {
    private final CursoRepository repository;

    public CursoViewController(CursoRepository repository){ this.repository = repository; }

    @GetMapping("/cadastro")
    public String cadastro(){
        return "cursos/cadastro-curso";
    }

    @PostMapping("/salvar")
    public String salvar(Curso curso){
        repository.save(curso);
        return "redirect:/cursos/cadastro";
    }
}

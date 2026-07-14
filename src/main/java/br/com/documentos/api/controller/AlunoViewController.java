package br.com.documentos.api.controller;

import br.com.documentos.api.entity.Aluno;
import br.com.documentos.api.repository.AlunoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/alunos")
public class AlunoViewController {
    private final AlunoRepository repository;

    public AlunoViewController(AlunoRepository repository){
        this.repository = repository;
    }

    // Abre a tela de cadastro
    @GetMapping("/cadastro")
    public String cadastro() {
        return "alunos/cadastro-aluno";
    }

    // Salva o cadastro com base nos campos populados
    @PostMapping("/salvar")
    public String salvar(Aluno aluno) {
        repository.save(aluno);
        return "redirect:/alunos/cadastro";
    }
}

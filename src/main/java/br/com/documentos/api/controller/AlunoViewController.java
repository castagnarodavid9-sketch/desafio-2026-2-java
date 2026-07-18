package br.com.documentos.api.controller;

import br.com.documentos.api.entity.Aluno;
import br.com.documentos.api.repository.AlunoRepository;
import org.springframework.validation.BindingResult;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/alunos")
public class AlunoViewController {
    private final AlunoRepository repository;

    public AlunoViewController(AlunoRepository repository){
        this.repository = repository;
    }

    // Abre a tela de cadastro
    @GetMapping("/cadastro")
    public String cadastro(Model model) {
        model.addAttribute("aluno", new Aluno());
        return "alunos/cadastro-aluno";
    }

    @GetMapping("/show")
    public String show(Model model) {
        model.addAttribute("alunos", repository.findAll());
        return "alunos/show-aluno";
    }

    // Salva o cadastro com base nos campos populados
    @PostMapping("/salvar")
    public String salvar(@Valid Aluno aluno, BindingResult result, RedirectAttributes attributes) {
        if (result.hasErrors()){
            return "alunos/cadastro-aluno";
        }
        repository.save(aluno);
        attributes.addFlashAttribute("mensagem", "Aluno cadastrado com sucesso!"); // Caso tenha sucesso ao salvar
        return "redirect:/alunos/cadastro";
    }
}

package br.com.documentos.api.controller;

import br.com.documentos.api.entity.Status;
import br.com.documentos.api.repository.StatusRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/status")
public class StatusViewController {
    private final StatusRepository repository;

    public StatusViewController(StatusRepository repository){
        this.repository = repository;
    }

    // Abre a tela de cadastro
    @GetMapping("/cadastro")
    public String cadastro() {
        return "status/cadastro-status";
    }

    // Salva o cadastro com base nos campos populados
    @PostMapping("/salvar")
    public String salvar(Status status) {
        repository.save(status);
        return "redirect:/status/cadastro";
    }
}

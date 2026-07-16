package br.com.documentos.api.controller;

import br.com.documentos.api.repository.HistoricoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    private final HistoricoRepository historicoRepository;

    public HomeController(HistoricoRepository historicoRepository) {
        this.historicoRepository = historicoRepository;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("historicos", historicoRepository.findAll());
        return "home/index";
    }
}
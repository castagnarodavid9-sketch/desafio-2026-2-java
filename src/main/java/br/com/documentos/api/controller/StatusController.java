package br.com.documentos.api.controller;

import br.com.documentos.api.entity.Status;
import br.com.documentos.api.repository.StatusRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/status")
public class StatusController {
    private final StatusRepository repository;

    public StatusController (StatusRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Status> listar(){
        return repository.findAll();
    }
}
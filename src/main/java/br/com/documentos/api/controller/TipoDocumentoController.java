package br.com.documentos.api.controller;

import br.com.documentos.api.entity.TipoDocumento;
import br.com.documentos.api.repository.TipoDocumentoRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/tipo_documentos")
public class TipoDocumentoController {
    private final TipoDocumentoRepository repository;

    public TipoDocumentoController (TipoDocumentoRepository repository){this.repository = repository;}

    @GetMapping
    public List<TipoDocumento> listar() {return repository.findAll();}
}

package br.com.documentos.api.controller;

import br.com.documentos.api.entity.TipoDocumento;
import br.com.documentos.api.repository.TipoDocumentoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/tipoDocumento")
public class TipoDocumentoViewController {
    private final TipoDocumentoRepository repository;

    public TipoDocumentoViewController(TipoDocumentoRepository repository){ this.repository = repository; }

    @GetMapping("/cadastro")
    public String cadastro(){
        return "tipoDocumentos/cadastro-tipoDocumento";
    }

    @PostMapping("/salvar")
    public String salvar(TipoDocumento tipoDoc){
        repository.save(tipoDoc);
        return "redirect:/tipoDocumento/cadastro";
    }
}

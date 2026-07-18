package br.com.documentos.api.controller;

import br.com.documentos.api.entity.Solicitacao;
import br.com.documentos.api.entity.Status;
import br.com.documentos.api.repository.*;
import br.com.documentos.api.service.SolicitacaoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Controller
@RequestMapping("/solicitacoes")
public class SolicitacaoViewController {

    private final SolicitacaoRepository solicitacaoRepository;
    private final AlunoRepository alunoRepository;
    private final CursoRepository cursoRepository;
    private final TipoDocumentoRepository tipoDocumentoRepository;
    private final StatusRepository statusRepository;
    private final SolicitacaoService solicitacaoService;

    public SolicitacaoViewController(SolicitacaoRepository solicitacaoRepository, AlunoRepository alunoRepository, CursoRepository cursoRepository, TipoDocumentoRepository tipoDocumentoRepository, StatusRepository statusRepository, SolicitacaoService solicitacaoService){
        this.solicitacaoRepository = solicitacaoRepository;
        this.alunoRepository = alunoRepository;
        this.cursoRepository = cursoRepository;
        this.tipoDocumentoRepository = tipoDocumentoRepository;
        this.statusRepository = statusRepository;
        this.solicitacaoService = solicitacaoService;
    }

    @GetMapping("/cadastro")
    public String cadastro(Model model){
        model.addAttribute("aluno", alunoRepository.findAll());
        model.addAttribute("curso", cursoRepository.findAll());
        model.addAttribute("tiposDocumento", tipoDocumentoRepository.findAll());
        model.addAttribute("status", statusRepository.findAll());
        return "solicitacoes/cadastro-solicitacao";
    }

    @GetMapping("/show")
    public String show(Model model){
        model.addAttribute("solicitacao", solicitacaoRepository.findAll());
        model.addAttribute("aluno", alunoRepository.findAll());
        model.addAttribute("curso", cursoRepository.findAll());
        model.addAttribute("tiposDocumento", tipoDocumentoRepository.findAll());
        model.addAttribute("status", statusRepository.findAll());
        return "solicitacoes/show-solicitacao";
    }

    @PostMapping("/salvar")
    public String salvar(Solicitacao solicitacao){
        Status status = statusRepository.findById(2).orElseThrow(() -> new RuntimeException("Status não encontrado."));
        solicitacao.setDataSolicitacao(new Date());
        solicitacao.setPrioridade("NORMAL");
        solicitacao.setStatus(status);
        solicitacaoService.salvar(solicitacao);
        return "redirect:/solicitacoes/cadastro";
    }

}

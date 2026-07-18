package br.com.documentos.api.service;

import br.com.documentos.api.entity.Historico;
import br.com.documentos.api.entity.Solicitacao;
import br.com.documentos.api.repository.HistoricoRepository;
import br.com.documentos.api.repository.SolicitacaoRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class SolicitacaoService {
    private final SolicitacaoRepository solicitacaoRepository;
    private final HistoricoRepository historicoRepository;

    public SolicitacaoService(SolicitacaoRepository solicitacaoRepository, HistoricoRepository historicoRepository){
        this.solicitacaoRepository = solicitacaoRepository;
        this.historicoRepository = historicoRepository;
    }

    @Transactional //Esse comando diz que se algo der errado em qualquer momento da inserção, ele reverte tudo
    public void salvar(Solicitacao solicitacao){
        // Aqui se salva a solicitação
        Solicitacao solicitacaoSalva = solicitacaoRepository.save(solicitacao);

        //Criar histórico
        Historico historico = new Historico();
        historico.setSolicitacao(solicitacaoSalva);
        historico.setStatusAnterior(solicitacaoSalva.getStatus());
        historico.setResponsavel("Aluno");
        historico.setDataAlteracao(solicitacaoSalva.getDataSolicitacao());

        // Salva o histórico
        historicoRepository.save(historico);
    }
}

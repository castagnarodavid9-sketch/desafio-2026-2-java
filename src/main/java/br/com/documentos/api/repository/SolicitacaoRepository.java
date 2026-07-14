package br.com.documentos.api.repository;

import br.com.documentos.api.entity.Solicitacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SolicitacaoRepository extends JpaRepository<Solicitacao, Integer>{}

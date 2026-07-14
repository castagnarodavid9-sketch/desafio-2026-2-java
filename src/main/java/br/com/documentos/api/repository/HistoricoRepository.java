package br.com.documentos.api.repository;

import br.com.documentos.api.entity.Historico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HistoricoRepository extends JpaRepository<Historico, Integer>{}

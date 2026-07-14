package br.com.documentos.api.repository;

import br.com.documentos.api.entity.TipoDocumento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoDocumentoRepository extends JpaRepository<TipoDocumento , Integer> {}

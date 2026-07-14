package br.com.documentos.api.repository;

import br.com.documentos.api.entity.Status;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusRepository extends JpaRepository<Status, Integer>{}

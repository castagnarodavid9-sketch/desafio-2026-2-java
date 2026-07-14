package br.com.documentos.api.repository;

import br.com.documentos.api.entity.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Integer>{}

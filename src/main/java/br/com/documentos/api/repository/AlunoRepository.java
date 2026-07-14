package br.com.documentos.api.repository;

// Essa classe serve para criar/abstrair automaticamente funções de CRUD a um banco de dados

import br.com.documentos.api.entity.Aluno;
import org.springframework.data.jpa.repository.JpaRepository; //Entrega alguns métodos do banco prontos (exemplo findAll, findById...)

public interface AlunoRepository extends JpaRepository<Aluno, Integer> {} //Aqui temos todas as funções de banco para usar na entidade alunos
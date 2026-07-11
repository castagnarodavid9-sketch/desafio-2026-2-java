package br.com.documentos.api.entity;

import jakarta.persistence.Entity; //Transforma essa classe em uma entidade do banco
import lombok.Data;

@Entity
@Table(name = "alunos") //Liga a classe com a tabela alunos
@Data
public class Aluno {
    //Mapeia os campos do banco para dentro da classe
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, unique = true)
    private String nome;

    private Boolean ativo;
    //Mapeia os campos do banco para dentro da classe
}
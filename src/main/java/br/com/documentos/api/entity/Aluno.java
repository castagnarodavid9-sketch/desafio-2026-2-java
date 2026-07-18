package br.com.documentos.api.entity;

import jakarta.persistence.*; //Esse importa todas as duas linhas logo abaixo
//import jakarta.persistence.Entity; //Transforma essa classe numa entidade do banco
//import jakarta.persistence.GeneratedValue; //Aqui é responsável por dizer que algum valor vai ser gerado do banco (primary key)
import lombok.Builder;
import jakarta.validation.constraints.*; //Validações
import lombok.Data; //Cria automaticamente 'getters' e ‘setters’ para não ter que criar na mão

@Entity
@Table(name = "alunos") //Liga a classe com a tabela alunos
@Data
public class Aluno {
    //Mapeia os campos do banco para dentro da classe
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "Nome do aluno deve ser informado!")
    @Size(max = 100, message = "O nome do aluno deve ter no máximo 100 caractéres!")
    private String nome;

    @NotBlank(message = "N° de matrícula deve ser informado.")
    @Size(max = 6, message = "O número de matrícula deve conter apenas 6 dígitos!")
    @Column(nullable = false, unique = true)
    private String matricula;

    private Boolean ativo = true;
}
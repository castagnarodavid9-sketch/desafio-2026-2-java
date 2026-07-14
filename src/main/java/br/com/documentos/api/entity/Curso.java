package br.com.documentos.api.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "cursos")
@Data
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;
}

package br.com.documentos.api.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "status")
@Data
public class Status {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;
    private String responsavel;
}


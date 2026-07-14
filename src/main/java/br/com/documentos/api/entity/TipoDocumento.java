package br.com.documentos.api.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tipo_documentos")
@Data
public class TipoDocumento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;
}

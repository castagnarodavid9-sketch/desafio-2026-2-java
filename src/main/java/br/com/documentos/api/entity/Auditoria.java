package br.com.documentos.api.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "auditoria")
@Data
public class Auditoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String entidade;

    @Column(name = "registro_id")
    private Integer registroId;

    private String operacao;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "data_operacao")
    private Date dataOperacao;
}

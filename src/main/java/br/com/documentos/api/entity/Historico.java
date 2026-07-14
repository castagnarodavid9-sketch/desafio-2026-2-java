package br.com.documentos.api.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "historico")
@Data
public class Historico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "solicitacao_id")
    private Solicitacao solicitacao;

    @ManyToOne
    @JoinColumn(name = "status_anterior_id")
    private Status statusAnterior;

    @ManyToOne
    @JoinColumn(name = "status_novo_id")
    private Status statusNovo;

    private String responsavel;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "data_alteracao")
    private Date dataAlteracao;
}

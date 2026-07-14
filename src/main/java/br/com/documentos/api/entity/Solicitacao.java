package br.com.documentos.api.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name = "solicitacoes")
@Data
public class Solicitacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne // Relacionamento um para muitos (um aluno para muitas solicitações)
    @JoinColumn(name = "aluno_id") // Informando qual a coluna utilizada para interligar
    private Aluno aluno;

    @ManyToOne
    @JoinColumn(name = "curso_id")
    private Curso curso;

    @ManyToOne
    @JoinColumn(name = "tipo_documento_id")
    private TipoDocumento tipoDocumento;

    @ManyToOne
    @JoinColumn(name = "status_id")
    private Status status;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "data_solicitacao") // Aqui você informa qual a coluna no banco de dados
    private Date dataSolicitacao;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "data_alteracao")
    private Date dataAlteracao;

    private String prioridade;
}
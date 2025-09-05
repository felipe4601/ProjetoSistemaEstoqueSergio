package br.com.insustriasergio.Industria.Sergio.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "ordem_producao", schema = "industria_sergio")
public class OrdemProducao {
    @Id
    @Column(name = "id_ordem_producao", nullable = false)
    private Integer id;

    @Column(name = "num_ordem", nullable = false, length = Integer.MAX_VALUE)
    private String numOrdem;

    @Column(name = "data_entrega", nullable = false)
    private LocalDate dataEntrega;

    @Column(name = "status", nullable = false, length = Integer.MAX_VALUE)
    private String status;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_receita_produto", nullable = false)
    private ReceitaProduto idReceitaProduto;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_cliente", nullable = false)
    private Cliente idCliente;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_produto", nullable = false)
    private Produto idProduto;

}
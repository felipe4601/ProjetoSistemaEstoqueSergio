package br.com.insustriasergio.Industria.Sergio.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "materia_prima", schema = "industria_sergio")
public class MateriaPrima {
    @Id
    @Column(name = "id_materia_prima", nullable = false)
    private Integer id;

    @Column(name = "nome", nullable = false, length = Integer.MAX_VALUE)
    private String nome;

    @Column(name = "unidade_medida")
    private Double unidadeMedida;

    @Column(name = "custo_unitario", precision = 10, scale = 4)
    private BigDecimal custoUnitario;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_fornecedor", nullable = false)
    private Fornecedor idFornecedor;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_estoque", nullable = false)
    private Estoque idEstoque;

}
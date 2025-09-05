package br.com.insustriasergio.Industria.Sergio.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "receita_produto", schema = "industria_sergio")
public class ReceitaProduto {
    @Id
    @Column(name = "id_receita_produto", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_materia_prima", nullable = false)
    private MateriaPrima idMateriaPrima;

    @Column(name = "quantidade", nullable = false)
    private Integer quantidade;

}
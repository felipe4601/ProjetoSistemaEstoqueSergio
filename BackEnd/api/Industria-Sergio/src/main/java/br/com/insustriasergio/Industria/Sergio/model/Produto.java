package br.com.insustriasergio.Industria.Sergio.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "produto", schema = "industria_sergio")
public class Produto {
    @Id
    @Column(name = "id_produto", nullable = false)
    private Integer id;

    @Column(name = "nome", nullable = false, length = Integer.MAX_VALUE)
    private String nome;

    @Column(name = "modelo", nullable = false, length = Integer.MAX_VALUE)
    private String modelo;

    @Column(name = "codigo", nullable = false, length = Integer.MAX_VALUE)
    private String codigo;

    @Column(name = "preco", nullable = false, precision = 10, scale = 4)
    private BigDecimal preco;

}
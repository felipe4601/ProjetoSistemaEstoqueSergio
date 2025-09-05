package br.com.insustriasergio.Industria.Sergio.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "estoque", schema = "industria_sergio")
public class Estoque {
    @Id
    @Column(name = "id_estoque", nullable = false)
    private Integer id;

    @Column(name = "quantidade", nullable = false)
    private Integer quantidade;

}
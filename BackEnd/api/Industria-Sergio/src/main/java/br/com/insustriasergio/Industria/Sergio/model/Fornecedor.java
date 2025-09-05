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
@Table(name = "fornecedor", schema = "industria_sergio")
public class Fornecedor {
    @Id
    @Column(name = "id_fornecedor", nullable = false)
    private Integer id;

    @Column(name = "nome", nullable = false, length = Integer.MAX_VALUE)
    private String nome;

    @Column(name = "endereco", length = Integer.MAX_VALUE)
    private String endereco;

    @Column(name = "telefone", nullable = false, length = Integer.MAX_VALUE)
    private String telefone;

    @Column(name = "email", nullable = false, length = Integer.MAX_VALUE)
    private String email;

}
package br.com.industriasergio.Sistema.de.Controle.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.OffsetDateTime;

// Avisando ao spring, que ele precisa criar os métodos getter e setter
@Getter
@Setter
@Entity

// Avisando ao spring, que essa classe é um espelho de uma tabela
// Inserimos o nome da tabela e o schema, que ela está inserida
@Table(name="fornecedor", schema="industriaSergio")
public class Fornecedor {



}

package br.com.industriasergio.Sistema.de.Controle.repository;


import br.com.industriasergio.Sistema.de.Controle.model.Fornecedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FornecedorRepository extends JpaRepository<Fornecedor, Integer> {
    

}

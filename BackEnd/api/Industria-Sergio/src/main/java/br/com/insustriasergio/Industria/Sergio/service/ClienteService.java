package br.com.insustriasergio.Industria.Sergio.service;

import br.com.insustriasergio.Industria.Sergio.model.Cliente;
import br.com.insustriasergio.Industria.Sergio.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

// Avisando ao spring, que essa classe é um service
@Service
public class ClienteService {
    // Criando uma constante, que irá guardar o meu repository
    // precisa ser constante, porque o meu repository sempre será o mesmo
    private final ClienteRepository clienteRepository;

    // Criando construtor para que serice dependa do repository
    // Essa é a injeção de dependência
    public ClienteService(ClienteRepository repo){
        clienteRepository = repo;
    }

    // Criando método para listar todos os clientes:
    public List<Cliente> listarTodos(){
        return clienteRepository.findAll();
    }
}

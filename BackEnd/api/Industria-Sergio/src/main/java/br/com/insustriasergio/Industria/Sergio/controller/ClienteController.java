package br.com.insustriasergio.Industria.Sergio.controller;

import br.com.insustriasergio.Industria.Sergio.model.Cliente;
import br.com.insustriasergio.Industria.Sergio.service.ClienteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// Avisando ao spring, que essa classe é um controller
// E que ele faz requisições
@RestController
@RequestMapping("/api/clientes")
public class ClienteController {
    // constante para o meu service, pois ele sempre será o mesmo
    private final ClienteService clienteService;

    // Construtor para fazer a injeção de dependência
    public ClienteController(ClienteService service){
        clienteService = service;
    }

    // Criando getmapping, que irá fazer a porta de entrada para pegar
    // dados do meu banco de dados
    // Aviso para o spring com uma anotação:
    @GetMapping
    // Como vamos retornar uma mensagem para a web, nós usamos o:
    // ResponseEntity
    public ResponseEntity<List<Cliente>> listarClientes(){
        List<Cliente> clientes = clienteService.listarTodos();
        return ResponseEntity.ok().body(clientes);
    }

}

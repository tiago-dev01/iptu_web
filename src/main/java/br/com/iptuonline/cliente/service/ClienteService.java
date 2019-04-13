package br.com.iptuonline.cliente.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.iptuonline.cliente.model.Cliente;
import br.com.iptuonline.cliente.repository.ClienteRepository;

@Service
public class ClienteService {
	
	private final ClienteRepository clienteRepository;
	
	public ClienteService(ClienteRepository clienteRepository) {
		super();
		this.clienteRepository = clienteRepository;
	}

	public List<Cliente> obtemTodosClientes() {
		return (List<Cliente>) clienteRepository.findAll();
	}

}

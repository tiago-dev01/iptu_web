package br.com.iptuonline.cliente.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.iptuonline.cliente.model.Cliente;
import br.com.iptuonline.cliente.service.ClienteService;
import br.com.iptuonline.imovel.model.Imovel;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;
	
	public ClienteController(ClienteService clienteService) {
		super();
		this.clienteService = clienteService;
	}

	@GetMapping
	public List<Cliente> obtemTodosClientes() {
		return clienteService.obtemTodosClientes();
	}
	
	@PostMapping("{cliente}/cadastrar/imovel")
	public void cadastrarImovel(@PathVariable Integer cliente, @RequestBody List<Imovel> imovel) {
		clienteService.cadastrarImovel(cliente,imovel);
	}
	
}

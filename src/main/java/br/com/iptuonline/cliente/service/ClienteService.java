package br.com.iptuonline.cliente.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.iptuonline.cliente.model.Cliente;
import br.com.iptuonline.cliente.repository.ClienteRepository;
import br.com.iptuonline.imovel.model.Imovel;
import br.com.iptuonline.imovel.repository.ImovelRepository;

@Service
public class ClienteService {
	
	private final ClienteRepository clienteRepository;
	
	private final ImovelRepository imovelRepository;
	
	public ClienteService(ClienteRepository clienteRepository, ImovelRepository imovelRepository) {
		super();
		this.clienteRepository = clienteRepository;
		this.imovelRepository = imovelRepository;
	}

	public List<Cliente> obtemTodosClientes() {
		return (List<Cliente>) clienteRepository.findAll();
	}

	public void vincularImovelUsuario(Integer cliente, List<Imovel> imovel) {
		Cliente cliente2 = clienteRepository.findClienteById(cliente);
		imovel.forEach(casas->{
			Imovel casa =  imovelRepository.findImovelById(casas.getId());
			cliente2.getImoveis().add(casa);
		});
		
		this.clienteRepository.save(cliente2);
	}

	public Cliente cadastrarCliente(Cliente cliente) {
		return clienteRepository.save(cliente);
	}

}

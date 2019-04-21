package br.com.iptuonline.cliente.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.iptuonline.cliente.model.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Integer> {

	Cliente findClienteById(Integer clienteId);
}

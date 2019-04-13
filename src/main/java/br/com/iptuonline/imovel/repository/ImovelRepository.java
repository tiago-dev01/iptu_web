package br.com.iptuonline.imovel.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.iptuonline.imovel.model.Imovel;

public interface ImovelRepository extends CrudRepository<Imovel, Integer>{

}

package br.com.iptuonline.imovel.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.iptuonline.imovel.model.Imovel;
import br.com.iptuonline.imovel.repository.ImovelRepository;

@Service
public class ImovelService {
	
	private final ImovelRepository imovelRepository;

	public ImovelService(ImovelRepository imovelRepository) {
		super();
		this.imovelRepository = imovelRepository;
	}

	public List<Imovel> obtemTodosImoveis() {
		return (List<Imovel>) imovelRepository.findAll();
	}

}

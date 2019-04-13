package br.com.iptuonline.imovel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.iptuonline.imovel.model.Imovel;
import br.com.iptuonline.imovel.service.ImovelService;

@RestController
@RequestMapping(value = "/imoveis")
public class ImovelController {

	@Autowired
	private ImovelService imovelService;

	public ImovelController(ImovelService imovelService) {
		super();
		this.imovelService = imovelService;
	}
	
	@GetMapping
	public List<Imovel> obtemTodosImoveis(){
		return imovelService.obtemTodosImoveis();
	}
}

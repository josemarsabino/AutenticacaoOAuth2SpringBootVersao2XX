package br.com.sada.springsecurityautenticacaobasicav2token.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sada.springsecurityautenticacaobasicav2token.model.Categoria;
import br.com.sada.springsecurityautenticacaobasicav2token.repository.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository categoriaRepository;

	public List<Categoria> findAll() {
		return categoriaRepository.findAll();
	}
	
	
	

}

package br.com.sada.springsecurityautenticacaobasicav2token.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sada.springsecurityautenticacaobasicav2token.model.Pessoa;
import br.com.sada.springsecurityautenticacaobasicav2token.repository.PessoaRepository;

@Service
public class PessoaService {

	@Autowired
	private PessoaRepository pessoasRepo;

	public List<Pessoa> findAll() {
		return pessoasRepo.findAll();
	}

}

package br.com.sada.springsecurityautenticacaobasicav2token.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.sada.springsecurityautenticacaobasicav2token.model.Pessoa;

import br.com.sada.springsecurityautenticacaobasicav2token.service.PessoaService;

@RestController
@RequestMapping("/pessoas")
public class PessoaResource {

	@Autowired
	private PessoaService pessoaService;

	@RequestMapping(method = RequestMethod.GET)
	public List<Pessoa> listarTodos() {
		return pessoaService.findAll();
	}

}

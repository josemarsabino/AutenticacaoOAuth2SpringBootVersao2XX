package br.com.sada.springsecurityautenticacaobasicav2token.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.sada.springsecurityautenticacaobasicav2token.model.Categoria;
import br.com.sada.springsecurityautenticacaobasicav2token.service.CategoriaService;

@RestController
@RequestMapping("/categorias")
public class CategoriaResource {

	@Autowired
	private CategoriaService categoriaService;

	@RequestMapping(method = RequestMethod.GET)
	public List<Categoria> listarTodos() {
		return categoriaService.findAll();
	}

}

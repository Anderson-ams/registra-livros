package br.com.dev.anderson.registralivro.application.controller;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RestController;

import br.com.dev.anderson.registralivro.application.api.LivrosApi;
import br.com.dev.anderson.registralivro.application.api.NovoLivroRequest;
import br.com.dev.anderson.registralivro.application.api.NovoLivroResponse;
import br.com.dev.anderson.registralivro.application.service.LivroApplicationService;
import br.com.dev.anderson.registralivro.livro.domain.Livro;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class LivrosController implements LivrosApi{


	private final LivroApplicationService livroApplicationService;

	@Override
	public NovoLivroResponse postNovoLivro(@Valid NovoLivroRequest novoLivro) {
		log.info("[start] LivroController - postNovoLivro");
		NovoLivroResponse livroAdd = livroApplicationService.novoLivroAdcionado(novoLivro);
		log.info("[finish] LivroController - postNovoLivro");
		return livroAdd;
	}
	
	@Override
	public Livro  getNovoLivro(@Valid NovoLivroRequest novoLivro) {
		log.info("[start] LivroController - getLivros");
		return null;
	}

	
}

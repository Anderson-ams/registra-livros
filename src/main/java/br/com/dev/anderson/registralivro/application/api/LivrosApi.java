package br.com.dev.anderson.registralivro.application.api;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.dev.anderson.registralivro.livro.domain.Livro;

@RestController
@RequestMapping(path = "/v1/livros")
public interface LivrosApi {

	@PostMapping
	@ResponseStatus(value = HttpStatus.CREATED)
	NovoLivroResponse postNovoLivro(@RequestBody @Valid NovoLivroRequest novoLivro);

	@GetMapping
	@ResponseStatus(value = HttpStatus.OK)
	Livro getNovoLivro(@Valid NovoLivroRequest novoLivro);
}

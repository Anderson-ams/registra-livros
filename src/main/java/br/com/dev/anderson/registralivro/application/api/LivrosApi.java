package br.com.dev.anderson.registralivro.application.api;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/v1/livros")
public interface LivrosApi {

	@PostMapping
	@ResponseStatus(value = HttpStatus.CREATED)
	NovoLivroResponse postNovoLivro(@RequestBody @Valid NovoLivroRequest novoLivro);

}

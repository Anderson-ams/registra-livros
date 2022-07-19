package br.com.dev.anderson.registralivro.application.service;

import javax.validation.Valid;

import br.com.dev.anderson.registralivro.application.api.NovoLivroRequest;
import br.com.dev.anderson.registralivro.application.api.NovoLivroResponse;

public interface LivroApplicationService {

	NovoLivroResponse novoLivroAdcionado(@Valid NovoLivroRequest novoLivro);


}

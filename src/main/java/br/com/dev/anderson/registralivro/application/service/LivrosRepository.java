package br.com.dev.anderson.registralivro.application.service;

import br.com.dev.anderson.registralivro.livro.domain.Livro;

public interface LivrosRepository {

	Livro salva(Livro adcionaLivro);

}

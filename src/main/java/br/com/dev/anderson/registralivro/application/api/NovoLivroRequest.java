package br.com.dev.anderson.registralivro.application.api;

import br.com.dev.anderson.registralivro.livro.domain.CategoriaDoLivro;
import lombok.Value;

@Value
public class NovoLivroRequest {

	private String nome;
	private String editora;
	private CategoriaDoLivro categoria;

}

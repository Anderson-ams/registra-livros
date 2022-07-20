package br.com.dev.anderson.registralivro.application.api;

import java.util.UUID;

import br.com.dev.anderson.registralivro.livro.domain.CategoriaDoLivro;
import br.com.dev.anderson.registralivro.livro.domain.Livro;
import lombok.Value;

@Value
public class NovoLivroResponse {

	private UUID id;
	private String nome;
	private String autor;
	private String editora;
	private CategoriaDoLivro categoria; 

	public NovoLivroResponse(Livro adcionaLivro) {

		this.id = adcionaLivro.getId();
		this.nome = adcionaLivro.getNome();
		this.autor = adcionaLivro.getAutor();
		this.editora = adcionaLivro.getEditora();
		this.categoria = adcionaLivro.getCategoria();

	}

}

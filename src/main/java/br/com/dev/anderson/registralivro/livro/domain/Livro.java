package br.com.dev.anderson.registralivro.livro.domain;

import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import br.com.dev.anderson.registralivro.application.api.NovoLivroRequest;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Document(collation = "livro")
public class Livro {

	@Id
	private UUID id;
	private String nome;
	private String autor;
	private String editora;
	@Builder.Default
	private CategoriaDoLivro categoria = CategoriaDoLivro.ROMANCE;

	public Livro(NovoLivroRequest novoLivro) {
		this.id = UUID.randomUUID();
		this.nome = novoLivro.getNome();
		this.autor = novoLivro.getAutor();
		this.editora = novoLivro.getEditora();
		this.categoria = CategoriaDoLivro.ROMANCE;
	}

}

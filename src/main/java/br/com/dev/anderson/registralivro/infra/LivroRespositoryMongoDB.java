package br.com.dev.anderson.registralivro.infra;

import org.springframework.stereotype.Repository;

import br.com.dev.anderson.registralivro.application.service.LivrosRepository;
import br.com.dev.anderson.registralivro.livro.domain.Livro;
import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class LivroRespositoryMongoDB implements LivrosRepository{

	private final LivrosMongoRepository livrosMongoRepository;

	@Override
	public Livro salva(Livro adcionaLivro) {
		return livrosMongoRepository.save(adcionaLivro);
	}

}

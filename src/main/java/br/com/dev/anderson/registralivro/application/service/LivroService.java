package br.com.dev.anderson.registralivro.application.service;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import br.com.dev.anderson.registralivro.application.api.NovoLivroRequest;
import br.com.dev.anderson.registralivro.application.api.NovoLivroResponse;
import br.com.dev.anderson.registralivro.livro.domain.Livro;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class LivroService implements LivroApplicationService {

	private final LivrosRepository livrosRepository;

	@Override
	public NovoLivroResponse novoLivroAdcionado(@Valid NovoLivroRequest novoLivro) {
		log.info("[start] LivroService - novoLivroAdcionado");
		Livro adcionaLivro = new Livro(novoLivro);
		livrosRepository.salva(adcionaLivro);
		log.info("[finish] LivroService - novoLivroAdcionado");
		return new NovoLivroResponse(adcionaLivro);
	}

}

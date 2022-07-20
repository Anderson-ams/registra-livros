package br.com.dev.anderson.registralivro.infra;

import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.dev.anderson.registralivro.livro.domain.Livro;

public interface LivrosMongoRepository extends MongoRepository<Livro, UUID> {}

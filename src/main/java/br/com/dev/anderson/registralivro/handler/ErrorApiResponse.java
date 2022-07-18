package br.com.dev.anderson.registralivro.handler;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
public class ErrorApiResponse {

	private String message;
	@JsonInclude(value = Include.NON_EMPTY)
	private String descricao;
	
}

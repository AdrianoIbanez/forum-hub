package br.alura.curso.forumhub.forum_hub.dtos.resposta;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

//@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosCadastroResposta(
        @NotNull Long topicoId,
        @NotNull Long usuarioId,
        @NotNull String mensagem,

        @NotNull @Future
        LocalDateTime data) { }

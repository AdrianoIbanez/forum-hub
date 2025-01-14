package br.alura.curso.forumhub.forum_hub.dtos.topicos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizarTopico(
        @NotNull
        Long id,
        String titulo,
        String mensagem,
        String dataDeCriacao,
        String estadoDoTopico,
        String autor,
        String curso) {

}
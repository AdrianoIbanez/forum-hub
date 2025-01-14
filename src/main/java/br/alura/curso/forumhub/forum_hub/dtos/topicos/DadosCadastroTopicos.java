package br.alura.curso.forumhub.forum_hub.dtos.topicos;

import jakarta.validation.constraints.NotBlank;

public record DadosCadastroTopicos(
        @NotBlank
        Long id,
        @NotBlank
        String titulo,
        @NotBlank
        String mensagem,
        @NotBlank
        String dataDeCriacao,
        @NotBlank
        String estadoDoTopico,
        @NotBlank
        String autor,
        @NotBlank
        String curso,
        @NotBlank
        String respostas
) {
}

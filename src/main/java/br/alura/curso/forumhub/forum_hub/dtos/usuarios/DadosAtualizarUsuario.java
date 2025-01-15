package br.alura.curso.forumhub.forum_hub.dtos.usuarios;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizarUsuario(
        @NotNull
        Long id,
        String login,
        String senha,
        String nome)
{
}

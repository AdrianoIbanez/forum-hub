package br.alura.curso.forumhub.forum_hub.usuarios;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizarUsuario(
        @NotNull
        Long id,
        String login,
        String senha,
        String nome)
{
}

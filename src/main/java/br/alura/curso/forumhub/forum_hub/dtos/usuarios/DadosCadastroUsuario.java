package br.alura.curso.forumhub.forum_hub.dtos.usuarios;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.validation.constraints.NotBlank;

//@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosCadastroUsuario(
        @NotBlank
        String nome,
        @NotBlank
        String login,
        @NotBlank
        String senha) {

}

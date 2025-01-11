package br.alura.curso.forumhub.forum_hub.models.usuarios;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosUsuarioLogin(@NotBlank String login,
                                @NotBlank String senha) {

}

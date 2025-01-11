package br.alura.curso.forumhub.forum_hub.models.usuarios;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosCadastroUsuario(@NotBlank(message = "nome.obrigatorio") String nome,
                                   @NotBlank(message = "login.obrigatorio") String login,
                                   @NotBlank(message = "senha.obrigatorio") String senha) {

}

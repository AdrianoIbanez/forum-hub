package br.alura.curso.forumhub.forum_hub.dtos.resposta;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosCadastroResposta(@NotBlank(
        message = "{mensagem.obrigatorio)")
        String mensagem) {

}

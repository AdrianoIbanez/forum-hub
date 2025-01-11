package br.alura.curso.forumhub.forum_hub.models.resposta;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosCadastroResposta(@NotBlank(
        message = "{mensagem.obrigatorio)")
        String mensagem) {

}

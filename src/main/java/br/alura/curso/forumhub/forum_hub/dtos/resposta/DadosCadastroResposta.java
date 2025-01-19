package br.alura.curso.forumhub.forum_hub.dtos.resposta;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.validation.constraints.NotBlank;

//@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosCadastroResposta(

        @NotBlank
        String mensagem
) {

}

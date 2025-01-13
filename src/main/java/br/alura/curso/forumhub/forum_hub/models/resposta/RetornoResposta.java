package br.alura.curso.forumhub.forum_hub.models.resposta;

import java.time.LocalDateTime;

/*public record RetornoResposta(String titulo_topico,
                              String mensagem,
                              String nome,
                              LocalDateTime horario) {
    public RetornoResposta(Resposta resposta) {
        this(resposta.getTopico().getTitulo(),
                resposta.getMensagem(),
                resposta.getUsuario().getNome(),
                resposta.getHorario());
    }
}

package br.alura.curso.forumhub.forum_hub.dtos.resposta;

import br.alura.curso.forumhub.forum_hub.Entidades.Resposta;

public record DadosDetalharResposta(Object o, Object o1, Object o2, Object o3) {

    public DadosDetalharResposta(Resposta resposta) {
        this(resposta.getId(), resposta.getTopico(), resposta.getUsuario(), resposta.getData());
    }
}

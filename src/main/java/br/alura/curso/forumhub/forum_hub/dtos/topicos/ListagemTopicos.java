package br.alura.curso.forumhub.forum_hub.dtos.topicos;

import br.alura.curso.forumhub.forum_hub.Entidades.Topico;
import br.alura.curso.forumhub.forum_hub.dtos.Curso;

public record ListagemTopicos(Long id,
                              String titulo,
                              Curso curso,
                              String mensagem,
                              String dataCriacao,
                              String respostas) {

    public ListagemTopicos(Topico topico) {
        this(topico.getId(),
                topico.getTitulo(),
                topico.getCurso(),
                topico.getMensagem(),
                topico.getDataCriacao(),
                topico.getRespostas());
    }

}

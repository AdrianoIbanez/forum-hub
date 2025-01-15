package br.alura.curso.forumhub.forum_hub.dtos.topicos;

import br.alura.curso.forumhub.forum_hub.Entidades.Topico;
import br.alura.curso.forumhub.forum_hub.dtos.Curso;

public record DadosDetalharTopico(
        Long id,
        String titulo,
        String mensagem,
        String dataDeCriacao,
        String estadoDoTopico,
        String autor,
        Curso curso,
        String respostas) {

    public DadosDetalharTopico(Topico topico) {
        this(topico.getId(),
                topico.getTitulo(),
                topico.getMensagem(),
                topico.getDataCriacao(),
                topico.getStatus(),
                topico.getAutor(),
                topico.getCurso(),
                topico.getRespostas());
    }
}




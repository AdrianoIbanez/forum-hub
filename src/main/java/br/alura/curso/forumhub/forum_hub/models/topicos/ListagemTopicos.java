package br.alura.curso.forumhub.forum_hub.models.topicos;

import br.alura.curso.forumhub.forum_hub.models.Curso;

import java.time.LocalDateTime;

public record ListagemTopicos(Long id,
                              String titulo,
                              Curso curso,
                              String mensagem,
                              Integer respostas,
                              String usuario_nome,
                              LocalDateTime horario,
                              Boolean ativo) {

    public ListagemTopicos(Topico topico) {
        this(topico.getId(),
                topico.getTitulo(),
                topico.getCurso(),
                topico.getMensagem(),
                (topico.getRespostas().size()),
                (topico.getUsuario().getNome()),
                topico.getHorario(),
                topico.getAtivo());
    }

}

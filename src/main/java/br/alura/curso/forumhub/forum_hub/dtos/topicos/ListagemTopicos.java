package br.alura.curso.forumhub.forum_hub.dtos.topicos;

/*public record ListagemTopicos(Long id,
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

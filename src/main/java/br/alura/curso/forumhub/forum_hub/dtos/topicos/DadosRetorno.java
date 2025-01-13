package br.alura.curso.forumhub.forum_hub.dtos.topicos;

/*public record DadosRetorno(
        Long id,
        String titulo,
        Curso curso,
        String mensagem,
        String nome,
        LocalDateTime horario) {

    public DadosRetorno(Topico topico) {
        this(topico.getId(),
                topico.getTitulo(),
                topico.getCurso(),
                topico.getMensagem(),
                topico.getUsuario().getNome(),
                topico.getHorario());
    }
}
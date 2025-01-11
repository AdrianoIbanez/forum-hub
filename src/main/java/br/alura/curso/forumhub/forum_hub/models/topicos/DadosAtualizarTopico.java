package br.alura.curso.forumhub.forum_hub.models.topicos;

public record DadosAtualizarTopico(
        String titulo,
        Curso curso,
        String mensagem) {
}

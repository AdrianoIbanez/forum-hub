package br.alura.curso.forumhub.forum_hub.models.topicos;

public record DadosCadastroTopicos(
        Long id,
        String titulo,
        String mensagem,
        String dataDeCriacao,
        String estadoDoTopico,
        String autor,
        String curso) {
}

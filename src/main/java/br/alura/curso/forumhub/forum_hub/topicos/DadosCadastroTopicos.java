package br.alura.curso.forumhub.forum_hub.topicos;

public record DadosCadastroTopicos(
        String id,
        String titulo,
        String mensagem,
        String dataDeCriacao,
        String estadoDoTopico,
        String autor,
        String curso) {
}

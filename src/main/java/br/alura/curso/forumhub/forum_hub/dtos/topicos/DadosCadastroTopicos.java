package br.alura.curso.forumhub.forum_hub.dtos.topicos;

public record DadosCadastroTopicos(
        Long id,
        String titulo,
        String mensagem,
        String dataDeCriacao,
        String estadoDoTopico,
        String autor,
        String curso,
        String respostas
) {
}

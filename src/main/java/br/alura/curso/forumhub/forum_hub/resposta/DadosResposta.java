package br.alura.curso.forumhub.forum_hub.resposta;

public record DadosResposta(
        String id,
        String mensagem,
        String topico,
        String dataCriacao,
        String autor,
        String solucao) {

}

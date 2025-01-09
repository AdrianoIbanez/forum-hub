package br.alura.curso.forumhub.forum_hub.models.resposta;

public record DadosResposta(
        String id,
        String mensagem,
        String topico,
        String dataCriacao,
        String autor,
        String solucao) {

}

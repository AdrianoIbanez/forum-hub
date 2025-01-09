package br.alura.curso.forumhub.forum_hub.models.usuarios;

public record DadosCadastroUsuario(
        String id,
        String nome,
        String email,
        String senha,
        String perfis) {
}

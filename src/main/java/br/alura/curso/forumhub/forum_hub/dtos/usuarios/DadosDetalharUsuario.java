package br.alura.curso.forumhub.forum_hub.dtos.usuarios;

import br.alura.curso.forumhub.forum_hub.Entidades.Usuario;




public record DadosDetalharUsuario(
        Long id,
        String login,
        String senha,
        String nome) {

    public DadosDetalharUsuario(Usuario usuario) {
        this(usuario.getId(),
                usuario.getLogin(),
                usuario.getSenha(),
                usuario.getNome());
            }
    }
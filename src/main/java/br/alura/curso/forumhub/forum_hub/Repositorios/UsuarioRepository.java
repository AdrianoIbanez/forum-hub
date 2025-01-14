package br.alura.curso.forumhub.forum_hub.Repositorios;

import br.alura.curso.forumhub.forum_hub.dtos.usuarios.Usuario;
import org.springframework.data.domain.Page;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Page<Usuario> findByLogin(String login);

}

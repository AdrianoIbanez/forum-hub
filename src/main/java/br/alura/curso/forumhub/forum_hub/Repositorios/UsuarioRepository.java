package br.alura.curso.forumhub.forum_hub.Repositorios;

import br.alura.curso.forumhub.forum_hub.models.usuarios.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

/*public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    @Query("SELECT u FROM Usuario u WHERE u.login = :login")
    Optional<Usuario> findByLogin(String login);

}

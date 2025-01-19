package br.alura.curso.forumhub.forum_hub.Repositorios;


import br.alura.curso.forumhub.forum_hub.Entidades.Resposta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RespostaRepository extends JpaRepository<Resposta, Long> {
}

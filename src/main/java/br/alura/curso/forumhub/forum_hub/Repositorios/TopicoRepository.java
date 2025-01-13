package br.alura.curso.forumhub.forum_hub.Repositorios;

import br.alura.curso.forumhub.forum_hub.Entidades.Topico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

 /*   @Query("SELECT t FROM Topico t WHERE t.ativo = true")
    Page<Topico> findAllByAtivo(Pageable paginacao);

    @Query("SELECT t FROM Topico t WHERE t.ativo = false")
    Page<Topico> findAllByDesativado(Pageable paginacao);

    @Query("SELECT t From Topico t")
    Page<Topico> findAllTest(Pageable paginacao);
    */
}

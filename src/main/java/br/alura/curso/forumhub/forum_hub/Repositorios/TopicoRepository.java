package br.alura.curso.forumhub.forum_hub.Repositorios;

import br.alura.curso.forumhub.forum_hub.Entidades.Topico;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TopicoRepository extends JpaRepository<Topico, Long> {
    Page<Topico> findAllByAtivoTrue(Pageable paginacao);

 /*   @Query("SELECT t FROM Topico t WHERE t.ativo = true")
    Page<Topico> findAllByAtivo(Pageable paginacao);

    @Query("SELECT t FROM Topico t WHERE t.ativo = false")
    Page<Topico> findAllByDesativado(Pageable paginacao);

    @Query("SELECT t From Topico t")
    Page<Topico> findAllTest(Pageable paginacao);
    */
}

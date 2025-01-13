package br.alura.curso.forumhub.forum_hub.Repositorios;

import br.alura.curso.forumhub.forum_hub.models.topicos.Topico;
import org.hibernate.query.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/*public interface TopicoRepository extends JpaRepository<Topico, Long> {

    @Query("SELECT t FROM Topico t WHERE t.ativo = true")
    Page<Topico> findAllByAtivo(Pageable paginacao);

    @Query("SELECT t FROM Topico t WHERE t.ativo = false")
    Page<Topico> findAllByDesativado(Pageable paginacao);

    @Query("SELECT t From Topico t")
    Page<Topico> findAllTest(Pageable paginacao);
}

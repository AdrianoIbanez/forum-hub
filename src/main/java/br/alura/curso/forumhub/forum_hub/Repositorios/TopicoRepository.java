package br.alura.curso.forumhub.forum_hub.Repositorios;

import br.alura.curso.forumhub.forum_hub.Entidades.Topico;
import br.alura.curso.forumhub.forum_hub.dtos.Curso;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;
import java.util.Optional;

public interface TopicoRepository extends JpaRepository<Topico, Long> {
    Page<Topico> findAllByAtivoTrue(Pageable paginacao);



    Topico escolherTopicoNaData(Curso curso, @NotNull @Future LocalDateTime data);

    @Query("""
            select t form Topico t
            where
            t.ativo = 1
            and
            t.curso = :curso
            and
            t.id not in(
                select r.topico.id from Resposta r
                where
                r.data = :data)
            """)
    Boolean findAtivoById(Long id);


 /*   @Query("SELECT t FROM Topico t WHERE t.ativo = true")
    Page<Topico> findAllByAtivo(Pageable paginacao);

    @Query("SELECT t FROM Topico t WHERE t.ativo = false")
    Page<Topico> findAllByDesativado(Pageable paginacao);

    @Query("SELECT t From Topico t")
    Page<Topico> findAllTest(Pageable paginacao);
    */
}

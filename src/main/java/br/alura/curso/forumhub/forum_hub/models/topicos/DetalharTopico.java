package br.alura.curso.forumhub.forum_hub.models.topicos;

import br.alura.curso.forumhub.forum_hub.models.Curso;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

/*public record DetalharTopico(
        Long id,
        String titulo,
        Curso curso,
        String mensagem,
        List<String> respostas,
        String usuario_nome,
        LocalDateTime horario,
        Boolean ativo) {

    public DetalharTopico(Topico topico) {
        this(topico.getId(),
                topico.getTitulo(),
                topico.getCurso(),
                topico.getMensagem(),
                (topico.getRespostas().stream().map(
                        r -> "id: " + r.getId() + " mensagem: " + r.getMensagem() +
                                " usuário: " + r.getUsuario().getNome()).collect(Collectors.toList())),
                (topico.getUsuario().getNome()), topico.getHorario(), topico.getAtivo());
    }
}
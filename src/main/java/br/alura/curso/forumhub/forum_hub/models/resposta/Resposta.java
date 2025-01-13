package br.alura.curso.forumhub.forum_hub.models.resposta;

import br.alura.curso.forumhub.forum_hub.models.topicos.Topico;
import br.alura.curso.forumhub.forum_hub.models.usuarios.Usuario;
import jakarta.persistence.*;

import java.time.LocalDateTime;

/*public class Resposta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String mensagem;

    @ManyToOne(fetch = FetchType.LAZY)
    private Usuario usuario;

    @ManyToOne(fetch = FetchType.LAZY)
    private Topico topico;

    private LocalDateTime horario;

    public Resposta(Long id, String mensagem, Usuario usuario, Topico topico,LocalDateTime horario) {
        this.id = id;
        this.mensagem = mensagem;
        this.topico = topico;
        this.usuario = usuario;
        this.horario = horario;
    }

    public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Topico getTopico() {
        return topico;
    }

    public void setTopico(Topico topico) {
        this.topico = topico;
    }

    public LocalDateTime getHorario() {
        return horario;
    }

    public void setHorario(LocalDateTime horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "Resposta [id=" + id + ", mensagem=" + ", usuario=" + usuario.getNome() + ", topico=" + topico.getTitulo()
                + ", horario=" + horario + "]";
    }
    public void atualizarResposta(DadosAtualizarResposta dados) {
        if (dados.mensagem() !=null) {
            setMensagem(dados.mensagem());
        }
    }
}

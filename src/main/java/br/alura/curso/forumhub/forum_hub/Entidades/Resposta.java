package br.alura.curso.forumhub.forum_hub.Entidades;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity(name = "Resposta")
@Table(name = "respostas")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

public class Resposta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "topico_id")
    private Topico topico;

    private LocalDateTime data;



    public Resposta(Long id, Usuario usuario, Topico topico,LocalDateTime data) {
        this.id = id;
        this.topico = topico;
        this.usuario = usuario;
        this.data = data;
    }
}
 /*   public Long getId() {
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


}*/

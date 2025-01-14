package br.alura.curso.forumhub.forum_hub.Entidades;

import br.alura.curso.forumhub.forum_hub.dtos.Curso;

import br.alura.curso.forumhub.forum_hub.dtos.topicos.DadosAtualizarTopico;
import br.alura.curso.forumhub.forum_hub.dtos.topicos.DadosCadastroTopicos;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "topicos")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

public class Topico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensagem;
    private String dataCriacao;
    private String status;
    private String autor;
    private String respostas;

    @Enumerated(EnumType.STRING)
    private Curso curso;

    private Boolean ativo;

    public Topico(DadosCadastroTopicos dados) {
        this.ativo = true;
        this.id = dados.id();
        this.titulo = dados.titulo();
        this.mensagem = dados.mensagem();
        this.dataCriacao = dados.dataDeCriacao();
        this.status = dados.estadoDoTopico();
        this.autor = dados.autor();
        this.curso = Curso.valueOf(dados.curso());
        this.respostas = dados.respostas();
    }

    public void atualizarInformacoes(@Valid DadosAtualizarTopico dados) {
        if (dados.titulo() != null) {
            this.titulo = dados.titulo();
        }
        if (dados.mensagem() != null) {
            this.mensagem = dados.titulo();
        }
        if (dados.dataDeCriacao() != null) {
            this.dataCriacao = dados.dataDeCriacao();
        }
        if (dados.estadoDoTopico() != null) {
            this.status = dados.estadoDoTopico();
        }
        if (dados.autor() != null) {
            this.autor = dados.autor();
        }
        if (dados.curso() != null) {
        this.curso = Curso.valueOf(dados.curso());
        }

        }

    public void excluir() {
        this.ativo = false;
    }
}

 /*   public Topico() {}

    @OneToMany(mappedBy = "topico", cascade = CascadeType.ALL, fetch = FetchType.EAGER )
    private List<Resposta> respostas;

    @ManyToOne(fetch = FetchType.LAZY)
    private Usuario usuario;
    private LocalDateTime horario;
    private Boolean ativo;
    public Topico(DadosCadastroTopicos dados) {
        setTitulo(dados.titulo());
        setCurso(dados.curso());
        setMensagem(dados.mensagem());
        setHorario(LocalDateTime.now());
        setAtivo(true);
    }

    public Topico(Long id, String titulo, String curso, String mensagem, List<Resposta> respostas, Usuario usuario,
                LocalDateTime horario, Boolean ativo) {
            this.id = id;
            this.titulo = titulo;
            this.curso = Curso.fromString(curso);
            this.mensagem = mensagem;
            this.respostas = respostas;
            this.usuario = usuario;
            this.horario = horario;
            this.ativo = ativo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id =id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = Curso.fromString(curso);
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public List<Resposta> getRespostas() {
        return respostas;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public LocalDateTime getHorario() {
        return horario;
    }

    public void setHorario(LocalDateTime horario) {
        this.horario =horario;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    @Override
    public String toString() {
        return "Topico [id=" + id + ", titulo=" + titulo + ", curso=" + curso + ", mensagem=" + mensagem
                + ", respostas=" + respostas.stream().map(r ->r.getId() + r.getMensagem()).collect(Collectors.toList()) + ", usuario=" + usuario.getNome() + ", horario=" + horario + "]";

    }

    public void atualizarTopico(DadosAtualizarTopico dados) {
        if (dados.titulo() != null) {
            setTitulo(dados.titulo());
        }

        if (dados.curso() != null) {
            this.curso = dados.curso();
        }

        if (dados.mensagem() != null) {
            setMensagem(dados.mensagem());
        }
        setHorario(LocalDateTime.now());
}


}*/

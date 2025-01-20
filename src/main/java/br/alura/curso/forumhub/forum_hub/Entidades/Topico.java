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

@Entity(name = "Topico")
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


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso() {
        this.curso = curso;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem() {
        this.mensagem = mensagem;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao() {
        this.dataCriacao = dataCriacao;
    }

    public String getRespostas() {
        return respostas;
    }

    public void setRespostas(String respostas) {
        this.respostas = respostas;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }


    }

/*
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

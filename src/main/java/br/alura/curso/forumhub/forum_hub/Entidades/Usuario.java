package br.alura.curso.forumhub.forum_hub.Entidades;

//import br.alura.curso.forumhub.forum_hub.dtos.resposta.Resposta;
import br.alura.curso.forumhub.forum_hub.dtos.usuarios.DadosCadastroUsuario;
import br.alura.curso.forumhub.forum_hub.usuarios.DadosAtualizarUsuario;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
@Table(name = "usuarios")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String login;
    private String senha;
    private String nome;

    private Boolean ativo;

    public Usuario(DadosCadastroUsuario dados) {
        this.ativo = true;
        this.id = dados.id();
        this.login = dados.login();
        this.senha = dados.senha();
        this.nome = dados.nome();
    }

    public void atualizarInformacoes(@Valid DadosAtualizarUsuario dados) {
        if (dados.login() != null) {
            this.login = dados.login();
        }
        if (dados.senha() != null) {
            this.senha = dados.senha();
        }
        if (dados.nome() != null) {
            this.nome = dados.nome();
        }
    }

    public void inativar() {
        this.ativo = false;
    }
}

/*    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Topico> topicos;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Resposta> respostas;

    private Boolean ativo;

    public Usuario() {
    }

    public Usuario(Long id, String login, String senha, String nome, List<Topico> topicos, List<Resposta> respostas,
                   Boolean ativo) {
        this.id = id;
        this.login = login;
        this.senha = senha;
        this.nome = nome;
        this.topicos = topicos;
        this.respostas = respostas;
        this.ativo = ativo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Topico> getTopicos() {
        return topicos;
    }

    public void setTopicos(List<Topico> topicos) {
        this.topicos = topicos;
    }

    public List<Resposta> getRespostas() {
        return respostas;
    }

    public void setRespostas(List<Resposta> respostas) {
        this.respostas = respostas;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    @Override
    public String toString() {
        return "Usuario [id=" + id + ", login=" + login + ", nome=" + nome + ", topicos=" + (topicos.stream().map(t -> t.getId() + t.getTitulo()).collect(Collectors.toList()))
                + ", respostas=" + (respostas.stream().map(r -> r.getId() + r.getMensagem()).collect(Collectors.toList())) + "]";
    }


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority("ROLE_USER"));
    }

    @Override
    public String getPassword() {
        return senha;
    }

    @Override
    public String getUsername() {
        return login;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }


}*/

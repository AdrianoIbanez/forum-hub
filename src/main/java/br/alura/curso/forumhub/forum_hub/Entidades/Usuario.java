package br.alura.curso.forumhub.forum_hub.Entidades;


import br.alura.curso.forumhub.forum_hub.dtos.usuarios.DadosCadastroUsuario;
import br.alura.curso.forumhub.forum_hub.dtos.usuarios.DadosAtualizarUsuario;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@Entity(name = "Usuario")
@Table(name = "usuarios")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

public class Usuario implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String login;
    private String senha;
    private String nome;

    private Boolean ativo;


    public Usuario(String login) {
        this.login = login;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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


}

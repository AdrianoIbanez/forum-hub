package br.alura.curso.forumhub.forum_hub.controller;


import br.alura.curso.forumhub.forum_hub.models.usuarios.DadosCadastroUsuario;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("usuarios")
public class UsuarioController {

    @PostMapping
    public void cadastrarUsuario(@RequestBody DadosCadastroUsuario dados) {
        System.out.println(dados);
    }
}


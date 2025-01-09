package br.alura.curso.forumhub.forum_hub.controller;


import br.alura.curso.forumhub.forum_hub.models.topicos.DadosCadastroTopicos;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("topicos")
public class TopicosController {

    @PostMapping
    public void cadastrarTopico(@RequestBody DadosCadastroTopicos dados) {
        System.out.println(dados);
    }
}

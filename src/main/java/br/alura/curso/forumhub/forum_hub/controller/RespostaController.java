package br.alura.curso.forumhub.forum_hub.controller;


import br.alura.curso.forumhub.forum_hub.models.resposta.DadosCadastroResposta;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("br/alura/curso/forumhub/forum_hub/models/resposta")
public class RespostaController {

    @PostMapping
    public void ResponderTopico(@RequestBody DadosCadastroResposta dados) {
        System.out.println(dados);
    }
}

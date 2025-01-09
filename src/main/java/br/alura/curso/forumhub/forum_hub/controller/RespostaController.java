package br.alura.curso.forumhub.forum_hub.controller;


import br.alura.curso.forumhub.forum_hub.resposta.DadosResposta;
import br.alura.curso.forumhub.forum_hub.topicos.DadosCadastroTopicos;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("resposta")
public class RespostaController {

    @PostMapping
    public void ResponderTopico(@RequestBody DadosResposta dados) {
        System.out.println(dados);
    }
}

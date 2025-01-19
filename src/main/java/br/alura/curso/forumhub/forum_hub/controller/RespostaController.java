package br.alura.curso.forumhub.forum_hub.controller;


import br.alura.curso.forumhub.forum_hub.dtos.resposta.DadosCadastroResposta;
import br.alura.curso.forumhub.forum_hub.dtos.resposta.DadosDetalharResposta;
import br.alura.curso.forumhub.forum_hub.dtos.resposta.RespostaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("respostas")
public class RespostaController {

    @Autowired
    private RespostaService respostaService;

    @PostMapping
    @Transactional
    public ResponseEntity ResponderTopico(@RequestBody DadosCadastroResposta dados) {
        var dto = respostaService.responder(dados);
        return ResponseEntity.ok(dto);
    }
}

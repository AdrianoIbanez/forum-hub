package br.alura.curso.forumhub.forum_hub.controller;


import br.alura.curso.forumhub.forum_hub.Entidades.Topico;
import br.alura.curso.forumhub.forum_hub.Repositorios.TopicoRepository;
import br.alura.curso.forumhub.forum_hub.dtos.topicos.DadosCadastroTopicos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("topicos")
public class TopicosController {

    @Autowired
    private TopicoRepository repository;

    @PostMapping
    public void cadastrarTopico(@RequestBody DadosCadastroTopicos dados) {
      //  System.out.println(dados);
        repository.save(new Topico(dados));
    }
}

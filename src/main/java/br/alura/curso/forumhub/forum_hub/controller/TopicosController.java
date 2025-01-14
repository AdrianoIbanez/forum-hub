package br.alura.curso.forumhub.forum_hub.controller;


import br.alura.curso.forumhub.forum_hub.Entidades.Topico;
import br.alura.curso.forumhub.forum_hub.Repositorios.TopicoRepository;
import br.alura.curso.forumhub.forum_hub.dtos.topicos.DadosCadastroTopicos;
import br.alura.curso.forumhub.forum_hub.dtos.topicos.ListagemTopicos;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("topicos")
public class TopicosController {

    @Autowired
    private TopicoRepository repository;

    @PostMapping
    @Transactional
    public void cadastrarTopico(@RequestBody @Valid DadosCadastroTopicos dados) {
        repository.save(new Topico(dados));
    }

    @GetMapping
    public Page<ListagemTopicos> listar(@PageableDefault(size = 10, sort = {"titulo"}) Pageable paginacao) {
        return repository.findAll(paginacao).map(ListagemTopicos::new);
    }
}

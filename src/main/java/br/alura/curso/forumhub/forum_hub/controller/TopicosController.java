package br.alura.curso.forumhub.forum_hub.controller;


import br.alura.curso.forumhub.forum_hub.Entidades.Topico;
import br.alura.curso.forumhub.forum_hub.Repositorios.TopicoRepository;
import br.alura.curso.forumhub.forum_hub.dtos.topicos.DadosAtualizarTopico;
import br.alura.curso.forumhub.forum_hub.dtos.topicos.DadosCadastroTopicos;
import br.alura.curso.forumhub.forum_hub.dtos.topicos.DadosDetalharTopico;
import br.alura.curso.forumhub.forum_hub.dtos.topicos.ListagemTopicos;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("topicos")
public class TopicosController {

    @Autowired
    private TopicoRepository repository;

    @PostMapping
    @Transactional
    public ResponseEntity cadastrarTopico(@RequestBody @Valid DadosCadastroTopicos dados, UriComponentsBuilder uriBuilder) {
        var topico = new Topico(dados);
        repository.save(topico);

        var uri = uriBuilder.path("/topicos/{id}").buildAndExpand(topico.getId()).toUri();

        return  ResponseEntity.created(uri).body(new DadosDetalharTopico(topico));
    }

    @GetMapping
    public ResponseEntity <Page<ListagemTopicos>> listar(@PageableDefault(size = 10, sort = {"titulo"}) Pageable paginacao) {
        var page = repository.findAllByAtivoTrue(paginacao).map(ListagemTopicos::new);
        return ResponseEntity.ok(page);
    }

    @PutMapping
    @Transactional
    public ResponseEntity atualizar(@RequestBody @Valid DadosAtualizarTopico dados) {
        var topico = repository.getReferenceById(dados.id());
        topico.atualizarInformacoes(dados);

        return ResponseEntity.ok(new DadosDetalharTopico(topico));
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity excluir(@PathVariable Long id) {
        var topico = repository.getReferenceById(id);
        topico.excluir();

        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity detalhar(@PathVariable Long id) {
        var topico = repository.getReferenceById(id);
        return ResponseEntity.ok(new DadosDetalharTopico(topico));
    }
}

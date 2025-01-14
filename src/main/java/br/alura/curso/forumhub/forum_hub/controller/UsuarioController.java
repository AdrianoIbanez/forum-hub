package br.alura.curso.forumhub.forum_hub.controller;


import br.alura.curso.forumhub.forum_hub.Entidades.Usuario;
import br.alura.curso.forumhub.forum_hub.Repositorios.UsuarioRepository;
import br.alura.curso.forumhub.forum_hub.dtos.topicos.ListagemTopicos;
import br.alura.curso.forumhub.forum_hub.dtos.usuarios.DadosCadastroUsuario;
import br.alura.curso.forumhub.forum_hub.dtos.usuarios.ListagemUsuarios;
import br.alura.curso.forumhub.forum_hub.usuarios.DadosAtualizarUsuario;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    @PostMapping
    @Transactional
    public void cadastrarUsuario(@RequestBody @Valid DadosCadastroUsuario dados) {
        repository.save(new Usuario(dados));
    }

    @GetMapping
    public Page<ListagemUsuarios> listar(@PageableDefault(size = 10, sort = {"name"}) Pageable paginacao) {
        return repository.findAllByAtivoTrue(paginacao).map(ListagemUsuarios::new);
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosAtualizarUsuario dados) {
        var usuarios = repository.getReferenceById(dados.id());
        usuarios.atualizarInformacoes(dados);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void remover(@PathVariable Long id) {
        var usuario = repository.getReferenceById(id);
        usuario.inativar();
    }
}




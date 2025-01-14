package br.alura.curso.forumhub.forum_hub.controller;


import br.alura.curso.forumhub.forum_hub.dtos.usuarios.DadosCadastroUsuario;
import jakarta.validation.Valid;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("usuarios")
public class UsuarioController {

    @PostMapping
    public void cadastrarUsuario(@RequestBody DadosCadastroUsuario dados) {
        System.out.println(dados);
    }
    repository.save(new Usurario(dados));
}

@PutMapping
@Transactional
public void atualizar(@RequestBody @Valid DadosAtualizacaoPaciente dados) {
    var paciente = repository.getReferenceById(dados.id());
    paciente.atualizarInformacoes(dados);
}

@DeleteMapping("/{id}")
@Transactional
public void remover(@PathVariable Long id) {
    var paciente = repository.getReferenceById(id);
    paciente.inativar();
}




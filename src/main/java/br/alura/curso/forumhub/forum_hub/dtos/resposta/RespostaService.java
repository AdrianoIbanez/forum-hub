package br.alura.curso.forumhub.forum_hub.dtos.resposta;

import br.alura.curso.forumhub.forum_hub.Entidades.Resposta;
import br.alura.curso.forumhub.forum_hub.Repositorios.RespostaRepository;
import br.alura.curso.forumhub.forum_hub.Repositorios.TopicoRepository;
import br.alura.curso.forumhub.forum_hub.Repositorios.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RespostaService {

    @Autowired
    private RespostaRepository respostaRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private TopicoRepository topicoRepository;

    public void responder (DadosCadastroResposta dados) {
        var topico = topicoRepository.findById(dados.topicoId()).get();
        var usuario = usuarioRepository.findById(dados.usuarioId()).get();
        var resposta = new Resposta(null, usuario, topico, dados.data());
        respostaRepository.save(resposta);
    }
}

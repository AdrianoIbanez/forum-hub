package br.alura.curso.forumhub.forum_hub.dtos.resposta;

import br.alura.curso.forumhub.forum_hub.Entidades.Resposta;
import br.alura.curso.forumhub.forum_hub.Entidades.Topico;
import br.alura.curso.forumhub.forum_hub.Infra.exception.ValidacaoException;
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


    public DadosDetalharResposta responder (DadosCadastroResposta dados) {
        if (!usuarioRepository.existsById(dados.usuarioId())) {
            throw new ValidacaoException("Id do usuário informado não existe!");
        }

        if (dados.topicoId() != null && !topicoRepository.existsById(dados.topicoId())) {
            throw new ValidacaoException("Id do tópico informado não existe!");
        }
        var topico = topicoRepository.findById(dados.topicoId()).get();
        if (topico == null) {
            throw new ValidacaoException("Tópicos não disponíveis para essa data");
        }
        var usuario = usuarioRepository.findById(dados.usuarioId()).get();
        var resposta = new Resposta(null, usuario, topico, dados.data());
        respostaRepository.save(resposta);

        return new DadosDetalharResposta(resposta);
    }

    private Topico escolherTopico(DadosCadastroResposta dados) {
       if (dados.topicoId() != null) {
           return topicoRepository.getReferenceById(dados.topicoId());
       }

       if (dados.curso() == null) {
           throw new ValidacaoException("Curso é obrigatório quano tópico não for escolhido! ");
       }

       return topicoRepository.escolherTopicoNaData(dados.curso(), dados.data());

    }
}

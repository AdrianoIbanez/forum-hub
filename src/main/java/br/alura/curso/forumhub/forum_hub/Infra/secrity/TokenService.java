package br.alura.curso.forumhub.forum_hub.Infra.secrity;

import br.alura.curso.forumhub.forum_hub.Entidades.Usuario;
import br.alura.curso.forumhub.forum_hub.dtos.usuarios.Usuario;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Date;

@Service
public class TokenService {

    @Value("${api.security.tokrn.secret}")
    private String secret;

    public String gerarToken(Usuario usuario) {
        try {
            var algoritmo = Algorithm.HMAC256(secret);
            return JWT.create()
                    .withIssuer("API Forum.hub")
                    .withSubject(usuario.getLogin())
                    .withExpiresAt(dataExpiracao())
                    .sign(algoritmo);
        } catch (JWTCreationException exception){
            throw new RuntimeException("erro ao gerar token jwt", exception);
        }


        }

    private Instant dataExpiracao() {
        return LocalDateTime.now().plusHours(2).toInstant(ZoneOffset.of("-03:00"));
    }
}
}

  /*  @Service
    public class TokenService {

        private final String senha = "";

        public String gerarToken(Usuario usuario) {
            try {
                Algorithm algorithm = Algorithm.HMAC256(senha);
                String token = JWT.create()
                        .withIssuer("API Forum.Hub")
                        .withSubject(usuario.getLogin())
                        .withExpiresAt(dataExpiracao())
                        .sign(algorithm);
                return token;
            } catch (JWTCreationException e) {
                throw new RuntimeException("Erro ao gerar token JWT", e);
            }
        }

        public String getSubject(String token) {
            try {
                var algorithm = Algorithm.HMAC256(senha);
                return JWT.require(algorithm)
                        .withIssuer("API Forum.Hub")
                        .build()
                        .verify(token)
                        .getSubject();
            } catch (JWTVerificationException e) {
                throw new RuntimeException("Token inválido ou expirado");
            }
        }

        public void validateToken(String token) {

            try {
                Algorithm algorithm = Algorithm.HMAC256(senha);
                JWTVerifier verifier = JWT.require(algorithm)
                        .withIssuer("API Forum.Hub")
                        .build();

                verifier.verify(token);
            } catch (JWTVerificationException e) {
                throw new RuntimeException("Erro ao validar o token: ", e);
            }
        }

        private Instant dataExpiracao() {
            return LocalDateTime.now().plusHours(2).toInstant(ZoneOffset.of("-03:00"));
        }
    }
}

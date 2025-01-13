package br.alura.curso.forumhub.forum_hub.services;

import br.alura.curso.forumhub.forum_hub.models.usuarios.Usuario;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

/*public class TokenService {

    @Service
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

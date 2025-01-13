package br.alura.curso.forumhub.forum_hub.Exceptions;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;
import java.util.stream.Collectors;

//@RestControllerAdvice
public class TratamentoErros {
/*    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<String> tratarErro404() {
        return ResponseEntity.notFound().build();
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<List<InnerTratamentoErros>> tratarErro400(MethodArgumentNotValidException ex) {
        var erros = ex.getFieldErrors();
        var listaErros = erros.stream()
                .map(e -> new InnerTratamentoErros(e))
                .collect(Collectors.toList());
        return ResponseEntity.badRequest().body(listaErros);
    }

    private record InnerTratamentoErros(String campo, String mensagem) {
        public InnerTratamentoErros(FieldError erro) {
            this(erro.getField(), erro.getDefaultMessage());
        }
    }

 */
}
package com.example.TratamentoExcecao.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice // Vai fazer o tratamento de todos os erros
public class GlobalExceptions {
    //para funcionar no Spring Boot temos que implementar um método que vai pegar o erro e
    // tornar ele como responseEntity
    @ExceptionHandler //Vai  utilizar essa configuração para fazer o tratamento do erro
    public ResponseEntity<String> processarErrorNotFound(ResourceNotFoundException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage() + " Global...");
    }
}

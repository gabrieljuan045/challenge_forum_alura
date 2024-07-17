package br.com.alura.forumAlura.infra.exception;

public class TokenException extends RuntimeException {
    public TokenException(String mensagem) {
        super(mensagem);
    }
}

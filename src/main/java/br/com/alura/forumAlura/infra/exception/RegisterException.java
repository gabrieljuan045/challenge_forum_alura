package br.com.alura.forumAlura.infra.exception;

public class RegisterException extends RuntimeException {
    public RegisterException(String message) {
        super(message);
    }
}

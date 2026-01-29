package itau_bank.system.backend.security.exceptions.login;

public class InvalidAuthenticationException extends RuntimeException {
    public InvalidAuthenticationException() {
        super("Falha na autenticação! CPF ou senha inválidos.");
    }
}

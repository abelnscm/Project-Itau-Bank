package itau_bank.system.backend.security.exceptions.login;

public abstract class LoginException extends RuntimeException {
    public LoginException(String message) {
        super(message);
    }
}

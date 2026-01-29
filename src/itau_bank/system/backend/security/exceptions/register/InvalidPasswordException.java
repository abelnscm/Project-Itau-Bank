package itau_bank.system.backend.security.exceptions.register;

public class InvalidPasswordException extends RegisterException {
    public InvalidPasswordException(String message) {
        super(message);
    }
}

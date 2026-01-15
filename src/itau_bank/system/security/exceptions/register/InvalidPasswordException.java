package itau_bank.system.security.exceptions.register;

public class InvalidPasswordException extends RegisterException {
    public InvalidPasswordException(String message) {
        super(message);
    }
}

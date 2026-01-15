package itau_bank.system.security.exceptions.register;

public abstract class RegisterException extends RuntimeException {
    public RegisterException(String message) {
        super(message);
    }
}

package itau_bank.system.security.exceptions.register;

public class InvalidEmailException extends RegisterException {
    public InvalidEmailException() {
        super("O e-mail é inválido.");
    }
}

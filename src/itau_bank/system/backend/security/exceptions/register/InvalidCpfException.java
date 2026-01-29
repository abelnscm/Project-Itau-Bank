package itau_bank.system.backend.security.exceptions.register;

public class InvalidCpfException extends RegisterException {
    public InvalidCpfException() {
        super("CPF inválido!");
    }
}

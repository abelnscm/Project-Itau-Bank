package itau_bank.system.security.exceptions.register;

public class InvalidCpfException extends RegisterException {
    public InvalidCpfException() {
        super("CPF inválido!");
    }
}

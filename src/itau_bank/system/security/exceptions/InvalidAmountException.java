package itau_bank.system.security.exceptions;

public class InvalidAmountException extends AccountException {
    public InvalidAmountException() {
        super("O valor informado precisa ser maior do que zero.");
    }
}

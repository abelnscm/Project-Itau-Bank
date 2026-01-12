package itau_bank.system.security.exceptions;

public class InsufficientBalanceException extends AccountException {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

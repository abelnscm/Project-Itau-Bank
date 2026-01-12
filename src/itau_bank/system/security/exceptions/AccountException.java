package itau_bank.system.security.exceptions;

public abstract class AccountException extends RuntimeException {
    public AccountException(String message){
        super(message);
    }
}

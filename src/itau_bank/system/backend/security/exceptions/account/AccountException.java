package itau_bank.system.backend.security.exceptions.account;

public abstract class AccountException extends RuntimeException {
    public AccountException(String message){
        super(message);
    }
}

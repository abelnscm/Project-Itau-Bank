package itau_bank.system.security.exceptions.account;

public abstract class AccountException extends RuntimeException {
    public AccountException(String message){
        super(message);
    }
}

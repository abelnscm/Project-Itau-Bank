package itau_bank.system.security.exceptions.account;

public class MinValueException extends AccountException{
    public MinValueException(double min) {
        super("O valor mínimo permitido: R$ " + min);
    }
}

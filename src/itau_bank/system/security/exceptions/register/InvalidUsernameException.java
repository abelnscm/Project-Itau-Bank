package itau_bank.system.security.exceptions.register;

public class InvalidUsernameException extends RegisterException {
    public InvalidUsernameException() {
        super("Nome de usuário inválido");
    }
}

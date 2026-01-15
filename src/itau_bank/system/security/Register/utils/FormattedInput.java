package itau_bank.system.security.register.utils;
import itau_bank.system.utils.Input;
import itau_bank.system.utils.Message;

public class FormattedInput {

    // Attributes
    Validation validation = new Validation();

    public String required(String message) {
        String value = Input.input(message);
        while (validation.isNullOrEmpty(value)) {
            Message.info("O campo não pode estar vazio.");
            value = Input.input(message);
        }
        return value;
    }

    public String requiredPassword(String message) {
        String value = Input.input(message);
        while (validation.isNullOrEmpty(value)) {
            Message.info("A senha não pode ser vazia.");
            value = Input.input(message);
        }
        return value;
    }

    public String requiredCPF(String message) {
        String value = Input.input(message);
        while (validation.isNullOrEmpty(value)) {
            Message.info("O CPF não pode ser vazio.");
            value = Input.input(message);
        }
        return value;

    }

}

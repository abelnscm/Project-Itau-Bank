package itau_bank.system.security.login.utils;
import itau_bank.system.utils.Input;
import itau_bank.system.utils.Message;

public class FormattedInput {

    // Attributes
    Validation validation = new Validation();

    public String requiredPassword(String message) {
        String value = Input.input(message);
        while (validation.isNullOrEmpty(value)) {
            Message.info("O campo não pode estar vazio.");
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

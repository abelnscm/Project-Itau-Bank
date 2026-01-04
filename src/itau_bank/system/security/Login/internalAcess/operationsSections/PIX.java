package itau_bank.system.security.login.internalAcess.operationsSections;
import itau_bank.system.security.login.internalAcess.user_data.User;
import itau_bank.system.security.register.tools.Validation;
import itau_bank.tools.Input;
import itau_bank.tools.Message;

public class PIX {
    // Attributes
    private User user;
    private Validation validation;

    // Constructor
    public PIX(User user) {
        this.user = user;
    }

    // Transaction methods
    public void transaction(){
        String key = Input.input("Digite uma chave PIX:");
        while(validation.isNullOrEmpty(key)) {
            Message.info("Por favor, insira uma chave válida.");
            return;
        }
        double valueTransfer = Double.parseDouble(Input.input("Quanto deseja transferir?"));

    }






}

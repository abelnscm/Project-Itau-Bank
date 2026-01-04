package itau_bank.system.security.login.internalAcess.operationsSections;
import itau_bank.system.security.login.internalAcess.user_data.User;
import itau_bank.system.security.register.tools.Validation;
import itau_bank.tools.Input;

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
        double valueTransfer = Double.parseDouble(Input.input("Quanto deseja transferir?"));
        user.getAccount().PIX(valueTransfer);

    }






}

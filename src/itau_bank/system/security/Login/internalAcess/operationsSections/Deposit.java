package itau_bank.system.security.login.internalAcess.operationsSections;
import itau_bank.tools.Input;
import itau_bank.system.security.login.internalAcess.user_data.User;

public class Deposit {
    // Attributes
    private User user;

    // Constructor
    public Deposit(User user) {
        this.user = user;
    }

    // Executions methods
    public void transaction(){
        double deposit = Double.parseDouble(Input.input("Quanto deseja depositar?"));
        user.getAccount().deposit(deposit);
}
}

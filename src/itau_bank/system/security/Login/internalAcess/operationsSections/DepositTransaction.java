package itau_bank.system.security.login.internalAcess.operationsSections;

import itau_bank.tools.Input;
import itau_bank.user_data.User;

public class DepositTransaction {
    // Attributes
    private User user;

    // Constructor
    public DepositTransaction(User user) {
        this.user = user;
    }

    // Executions methods
    public void deposit(){
        double deposit = Double.parseDouble(Input.input("Quanto deseja depositar?"));
        user.getAccount().deposit(deposit);
    }
}

package itau_bank.system.security.login.internalAcess.operationsSections;
import itau_bank.tools.Input;
import itau_bank.user_data.User;
import javax.swing.*;

public class WithdrawalTransaction {
    // Attributes
    private User user;

    // Constructor
    public WithdrawalTransaction(User user) {
        this.user = user;
    }

    // Executions methods
    public void withdrawal(){
        double withdrawal = Double.parseDouble(Input.input("Quanto deseja sacar?"));
        user.getAccount().withdrawal(withdrawal);
    }







}

package itau_bank.system.security.login.internalAcess.operationsSections;
import itau_bank.tools.Input;
import itau_bank.system.security.login.internalAcess.user_data.User;

public class Withdrawal {
    // Attributes
    private User user;

    // Constructor
    public Withdrawal(User user) {
        this.user = user;
    }

    // Executions methods
    public void transaction(){
        double withdrawal = Double.parseDouble(Input.input("Quanto deseja sacar?"));
        user.getAccount().withdrawal(withdrawal);
    }







}

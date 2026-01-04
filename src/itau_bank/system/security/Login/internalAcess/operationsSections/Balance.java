package itau_bank.system.security.login.internalAcess.operationsSections;
import itau_bank.system.security.login.internalAcess.user_data.User;
import itau_bank.tools.Message;

public class Balance {
    // Attributes
    private User user;

    // Constructor
    public Balance(User user) {
        this.user = user;
    }
    public String see(){
        String message = String.format("Seu saldo é de R$ ");
        String balance = String.valueOf(user.getAccount().getBalance());
        return Message.info(message + balance);
    }
}

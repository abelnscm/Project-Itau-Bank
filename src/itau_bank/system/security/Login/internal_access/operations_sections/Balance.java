package itau_bank.system.security.login.internal_access.operations_sections;
import itau_bank.system.security.login.internal_access.user_data.User;
import itau_bank.system.utils.Message;

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

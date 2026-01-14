package itau_bank.system.security.login.internal_access.transactions;
import itau_bank.system.security.exceptions.account.AccountException;
import itau_bank.system.utils.Input;
import itau_bank.system.security.login.internal_access.data.User;
import itau_bank.system.utils.Message;
import itau_bank.system.utils.DATE_TIME;

public class Withdrawal {
    // Attributes
    private User user;

    // Constructor
    public Withdrawal(User user) {
        this.user = user;
    }

    // Executions methods
    public void transaction(){
        try {
            double withdrawal = readValue();
            user.getAccount().withdrawal(withdrawal);
            Message.info("Saque realizado com sucesso.");
            user.getAccount().getExtract().add(
                    String.format(
                            "Você sacou R$ %.2f às %s. \n",
                            withdrawal,
                            DATE_TIME.NOW()
                    )
            );
        } catch (AccountException e) {
            Message.info(e.getMessage());
        }
    }


// Specific methods
    private double readValue() {
        while(true) {
            try {
                return Double.parseDouble(Input.input("Quanto deseja sacar?"));
            } catch (NumberFormatException e) {
                Message.info("Valor inválido. Tente novamente.");
            }
        }
    }

}

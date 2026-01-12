package itau_bank.system.security.login.internal_acess.operations_sections;
import itau_bank.system.security.exceptions.AccountException;
import itau_bank.system.security.exceptions.MinValueException;
import itau_bank.utils.Input;
import itau_bank.system.security.login.internal_acess.user_data.User;
import itau_bank.utils.Message;
import itau_bank.utils.DATE_TIME;

public class Deposit {
    // Attributes
    private User user;


    // Constructor
    public Deposit(User user) {
        this.user = user;
    }

    // Executions methods
    public void transaction(){
        try {
            double deposit = readValue();
            user.getAccount().deposit(deposit);
            Message.info("Depósito realizado com sucesso.");
            user.getAccount().getExtract().add(String.format(
                    "Você depositou R$ %.2f às %s. \n",
                    deposit,
                    DATE_TIME.NOW()
            ));

        } catch (AccountException e) {
            Message.info(e.getMessage());
        }


}

    // Specif methods
    private double readValue() {
        while(true) { // Exceptions trataments
            try {return Double.parseDouble(Input.input("Quanto deseja depositar?"));}

            catch (NumberFormatException e) {
                Message.info("Valor inválido. Tente novamente.");
            }
        }
    }
}

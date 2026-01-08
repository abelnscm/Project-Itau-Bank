package itau_bank.system.security.login.internalAcess.operationsSections;
import itau_bank.utils.Input;
import itau_bank.system.security.login.internalAcess.user_data.User;
import itau_bank.utils.Message;
import itau_bank.utils.dateTime;

public class Deposit {
    // Attributes
    private User user;


    // Constructor
    public Deposit(User user) {
        this.user = user;
    }

    // Executions methods
    public void transaction(){
        double deposit;

        while(true) { // Exceptions trataments
            try {
                deposit = Double.parseDouble(Input.input("Quanto deseja depositar?"));
                break;
            } catch (NumberFormatException e) {
                Message.info("Valor inválido. Tente novamente.");
            }
        }

        if(!user.getAccount().deposit(deposit)){
            Message.info("O valor mínimo para depósito é de R$ 0,25");
            return;
        }

        Message.info("O depósito foi realizado com sucesso!");

        String message = String.format(
                "Você depositou R$ %.2f às %s. \n",
                deposit,
                dateTime.now()
        );

        user.getAccount().getExtract().add(message);

}
}

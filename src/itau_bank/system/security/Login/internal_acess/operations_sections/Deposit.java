package itau_bank.system.security.login.internal_acess.operations_sections;
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
                DATE_TIME.NOW()
        );

        user.getAccount().getExtract().add(message);

}
}

package itau_bank.system.security.login.internal_acess.operations_sections;
import itau_bank.utils.Input;
import itau_bank.system.security.login.internal_acess.user_data.User;
import itau_bank.utils.Message;
import itau_bank.utils.DATE_TIME;

public class Withdrawal {
    // Attributes
    private User user;

    // Constructor
    public Withdrawal(User user) {
        this.user = user;
    }

    // Executions methods
    public void transaction(){
        double withdrawal;

        while(true) {
            try {
                withdrawal = Double.parseDouble(Input.input("Quanto deseja sacar?"));
                break;
            } catch (NumberFormatException e) {
                Message.info("Valor inválido. Tente novamente.");
            }
        }

        if(!user.getAccount().withdrawal(withdrawal)){
            Message.info("A transação de saque falhou.");
            return;
        }

        Message.info("A transação de saque foi bem-sucedida!");
        String message = String.format(
                "Você sacou R$ %.2f às %s. \n",
                withdrawal,
                DATE_TIME.NOW()
        );
        user.getAccount().getExtract().add(message);

    }







}

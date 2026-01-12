package itau_bank.system.security.login.internal_acess.operations_sections;
import itau_bank.system.security.exceptions.AccountException;
import itau_bank.system.security.login.internal_acess.user_data.User;
import itau_bank.utils.Input;
import itau_bank.utils.Message;
import itau_bank.utils.DATE_TIME;

public class PIX {
    // Attributes
    private User user;

    // Constructor
    public PIX(User user) {
        this.user = user;
    }

    // Transaction methods
    public void transaction(){
        try {
            double valueTransfer = readValue();
            user.getAccount().PIX(valueTransfer);
            Message.info("Pix realizado com sucesso!");
            user.getAccount().getExtract().add(
                    String.format(
                            "Você transferiu R$ %.2f via PIX às %s. \n",
                            valueTransfer,
                            DATE_TIME.NOW()
                    )
            );
        } catch (AccountException e) {
            Message.info(e.getMessage());
        }

    }

    // Specific Methods
    private double readValue() {
        while(true) {
            try {return Double.parseDouble(Input.input("Quanto deseja transferir?"));}

            catch (NumberFormatException e) {
                Message.info("Valor inválido. Tente novamente.");
            }
        }
    }







}

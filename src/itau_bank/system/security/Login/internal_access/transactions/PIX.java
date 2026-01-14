package itau_bank.system.security.login.internal_access.transactions;
import itau_bank.system.security.exceptions.account.AccountException;
import itau_bank.system.security.login.internal_access.data.User;
import itau_bank.system.utils.Input;
import itau_bank.system.utils.Message;
import itau_bank.system.utils.DATE_TIME;

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

    // Reader Method
    private double readValue() {
        while(true) {
            try {return Double.parseDouble(Input.input("Quanto deseja transferir?"));}

            catch (NumberFormatException e) {
                Message.info("Valor inválido. Tente novamente.");
            }
        }
    }







}

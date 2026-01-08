package itau_bank.system.security.login.internalAcess.operationsSections;
import itau_bank.system.security.login.internalAcess.user_data.User;
import itau_bank.utils.Input;
import itau_bank.utils.Message;
import itau_bank.utils.dateTime;

public class PIX {
    // Attributes
    private User user;

    // Constructor
    public PIX(User user) {
        this.user = user;
    }

    // Transaction methods
    public void transaction(){
        double valueTransfer;

        while(true) {
            try {
                valueTransfer = Double.parseDouble(Input.input("Quanto deseja transferir?"));
                break;
            } catch (NumberFormatException e) {
                Message.info("Valor inválido. Tente novamente.");
            }
        }

        if(!user.getAccount().PIX(valueTransfer)){
            Message.info("O valor mínimo de transferência via PIX é de R$ 0,10");
            return;
        }

        Message.info("Pix realizado com sucesso!");

        String message = String.format(
                "Você transferiu R$ %.2f via PIX às %s. \n",
                valueTransfer,
                dateTime.now()
        );

        user.getAccount().getExtract().add(message);


    }

    // Getters
    public void getPixKey() { // Ainda inutilizada
        String pixKey = Input.input("Digite uma chave pix válida:");

    }






}

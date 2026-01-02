package itau_bank.system.security.login.internalAcess.tools;
import itau_bank.system.security.login.internalAcess.operationsSections.WithdrawalTransaction;
import itau_bank.user_data.User;
import javax.swing.*;

public class Options {

    // Attributes
    private User user;
    private WithdrawalTransaction withdrawal;

    // Constructor
    public Options(User user) {
        this.user = user;
        this.withdrawal = new WithdrawalTransaction(user);
    }


    public void choice(User user) { // Método de escolha

        // Attributes
        int choice;
        String[] options = {
                "Sacar", // 0
                "Depositar" // 1
                ,"Transferência via PIX", // 2
                "Ver saldo", // 3
                "Extrato", // 4
                "Sair"}; // 5


        // Interface
        choice = JOptionPane.showOptionDialog(
                null,
                "Escolha uma opção:",
                "Menu",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                options,
                options[0]);

        switch (choice) {
            case 0:
                withdrawal.withdrawal();
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
        }

        }




    }




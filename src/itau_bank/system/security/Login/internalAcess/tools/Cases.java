package itau_bank.system.security.login.internalAcess.tools;
import itau_bank.system.security.login.internalAcess.operationsSections.DepositTransaction;
import itau_bank.system.security.login.internalAcess.operationsSections.WithdrawalTransaction;
import itau_bank.user_data.User;
import javax.swing.*;


public class Cases {

    // Attributes
    private WithdrawalTransaction withdrawal;
    private DepositTransaction deposit;
    private User user;
    int choice;
    private String[] options = {"Sacar", "Depositar","Transferência via PIX", "Ver saldo", "Extrato", "Sair"};

    // Constructor
    public Cases(User user) {
        this.withdrawal = new WithdrawalTransaction(user);
        this.deposit =  new DepositTransaction(user);
    }

    // Verify Methods
    public void verify(){
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
                deposit.deposit();
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

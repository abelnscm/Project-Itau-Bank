package itau_bank.system.security.login.internalAcess.intefaces;
import itau_bank.system.security.login.internalAcess.operationsSections.Deposit;
import itau_bank.system.security.login.internalAcess.operationsSections.PIX;
import itau_bank.system.security.login.internalAcess.operationsSections.Withdrawal;
import itau_bank.system.security.login.internalAcess.user_data.User;
import javax.swing.*;


public class Cases {

    // Attributes
    private Withdrawal withdrawal;
    private Deposit deposit;
    private PIX PIX;
    private User user;
    int choice;
    private String[] options = {"Sacar", "Depositar","Transferência via PIX", "Ver saldo", "Extrato", "Sair"};

    // Constructor
    public Cases(User user) {
        this.withdrawal = new Withdrawal(user);
        this.deposit =  new Deposit(user);
        this.PIX = new PIX(user);
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
                withdrawal.transaction();
                break;
            case 1:
                deposit.transaction();
                break;
            case 2:
                PIX.transaction();
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

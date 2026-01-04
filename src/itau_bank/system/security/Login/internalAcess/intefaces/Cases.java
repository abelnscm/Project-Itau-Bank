package itau_bank.system.security.login.internalAcess.intefaces;
import itau_bank.system.security.login.internalAcess.operationsSections.Balance;
import itau_bank.system.security.login.internalAcess.operationsSections.Deposit;
import itau_bank.system.security.login.internalAcess.operationsSections.PIX;
import itau_bank.system.security.login.internalAcess.operationsSections.Withdrawal;
import itau_bank.system.security.login.internalAcess.user_data.User;
import itau_bank.tools.Message;
import javax.swing.*;


public class Cases {

    // Attributes
    private Withdrawal withdrawal;
    private Deposit deposit;
    private PIX PIX;
    private User user;
    private int choice;
    private String[] options = {"Sacar", "Depositar","Transferência via PIX", "Ver saldo", "Extrato", "Sair"};
    private Messages messages;
    private Balance balance;

    // Constructor
    public Cases(User user) {
        this.withdrawal = new Withdrawal(user);
        this.deposit =  new Deposit(user);
        this.PIX = new PIX(user);
        this.messages = new Messages(user);
        this.balance = new Balance(user);
    }

    // Verify Methods
    public void verify(){

        choice = JOptionPane.showOptionDialog(
                null,
                messages.messageCase(),
                "Menu",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                options,
                options[0]);

        switch (choice) {
            case 0:
                Message.info("Abrindo seção de saque...");
                withdrawal.transaction();
                break;
            case 1:
                Message.info("Abrindo seção de depósito...");
                deposit.transaction();
                break;
            case 2:
                Message.info("Abrindo seção de pix...");
                PIX.transaction();
                break;
            case 3:  Message.info("Abrindo saldo bancário...");
            balance.see();
            break;



        }

    }

    }


package itau_bank.system.security.login.internalAcess.menu.Menu;
import itau_bank.system.security.login.internalAcess.operationsSections.*;
import itau_bank.system.security.login.internalAcess.user_data.User;
import itau_bank.tools.Message;

public class Select {
    // Attributes
    private Withdrawal withdrawal;
    private Deposit deposit;
    private PIX pix;
    private Extract extract;
    private Balance balance;

    // Constructor
    public Select(User user) {
        this.withdrawal = new Withdrawal(user);
        this.deposit = new Deposit(user);
        this.pix = new PIX(user);
        this.extract = new Extract();
        this.balance = new Balance(user);
    }

    // tools select
    protected void cases(int choice){
        switch (choice){
            case 0:
                Message.info("Abrindo seção de saque...");
                withdrawal.transaction();
                break;
            case 1:
                Message.info("Abrindo seção de depósito...");
                deposit.transaction();
                break;
            case 2:
                Message.info("Abrindo seção de PIX...");
                pix.transaction();
                break;
            case 3:
                Message.info("Abrindo saldo...");
                balance.see();
                break;
            case 4:
                Message.info("Abrindo extrato...");
                extract.show();
                break;
            case 5:
                Message.info("Sessão encerrada.");
                break;
        }
    }

}

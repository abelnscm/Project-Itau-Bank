package itau_bank.system.security.login.internal_access.menu;
import itau_bank.system.security.login.internal_access.transactions.*;
import itau_bank.system.security.login.internal_access.data.User;
import itau_bank.system.utils.Message;

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
                withdrawal.transaction();
                break;
            case 1:
                deposit.transaction();
                break;
            case 2:
                pix.transaction();
                break;
            case 3:
                balance.see();
                break;
            case 4:
                extract.show();
                break;
            case 5:
                Message.info("Sessão encerrada.");
                break;
        }
    }

}

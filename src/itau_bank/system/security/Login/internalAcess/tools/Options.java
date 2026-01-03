package itau_bank.system.security.login.internalAcess.tools;
import itau_bank.system.security.login.internalAcess.operationsSections.WithdrawalTransaction;
import itau_bank.user_data.User;


public class Options {

    // Attributes
    private Menu menu;
    private User user;
    private WithdrawalTransaction withdrawal;

    // Constructor
    public Options(User user) {
        this.user = user;
        this.withdrawal = new WithdrawalTransaction(user);
        this.menu = new Menu(user);
    }

    // Executions methods
    public void choice(User user) { // Método de escolha
        menu.showMenu();
    }




    }




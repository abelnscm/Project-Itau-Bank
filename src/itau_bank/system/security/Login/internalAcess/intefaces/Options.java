package itau_bank.system.security.login.internalAcess.intefaces;
import itau_bank.system.security.login.internalAcess.operationsSections.Withdrawal;
import itau_bank.system.security.login.internalAcess.user_data.User;

public class Options {

    // Attributes
    private Menu menu;
    private User user;
    private Withdrawal withdrawal;

    // Constructor
    public Options(User user) {
        this.user = user;
        this.withdrawal = new Withdrawal(user);
        this.menu = new Menu(user);
    }

    // Executions methods
    public void choice() { // Método de escolha
        menu.showMenu();
    }




    }




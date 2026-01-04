package itau_bank.system.security.login.internalAcess.intefaces;
import itau_bank.system.security.login.internalAcess.user_data.User;

public class Menu {
    // Attributes
    private Cases cases;
    private User user;

    // Constructor
    public Menu(User user) {
        this.user = user;
        this.cases = new Cases(user);
    }

    // Interface method
    public void showMenu(){
        cases.verify();
        }
    }






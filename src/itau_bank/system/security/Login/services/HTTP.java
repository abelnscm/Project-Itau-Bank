package itau_bank.system.security.login.services;
import itau_bank.system.security.login.internal_access.menu.Menu;
import itau_bank.system.security.login.internal_access.data.User;

public class HTTP {
    // Attributes
    private final Menu menu;

    // Constructor
    public HTTP(User user) {
        this.menu = new Menu(user);
    }

    // Session Access
    public static void start(User user) {
        if (user != null) new HTTP(user).access();
    }

    // Client server
    private void access() {
        menu.start();
    }



}

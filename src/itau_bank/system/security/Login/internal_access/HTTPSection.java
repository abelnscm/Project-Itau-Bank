package itau_bank.system.security.login.internal_access;
import itau_bank.system.security.login.internal_access.menu.options.Menu;
import itau_bank.system.security.login.internal_access.menu.messages.Messages;
import itau_bank.system.security.login.internal_access.user_data.User;

public class HTTPSection {
    // Attributes
    private Messages messages;
    private Menu menu;

    // Constructor
    public HTTPSection(User user) {
        this.messages = new Messages(user);
        this.menu = new Menu(user);
    }

    // Acessess methods
    public static void acessAccount(User user) {
        if(user == null) {
            return;
        }
            HTTPSection section = new HTTPSection(user);
            section.start();
    }

    // Client server
    private void start() {
        messages.welcome();
        menu.start();
    }



}

package itau_bank.system.security.login.internalAcess;
import itau_bank.system.security.login.internalAcess.intefaces.Menu.Menu;
import itau_bank.system.security.login.internalAcess.intefaces.Messages.Messages;
import itau_bank.tools.Message;
import itau_bank.system.security.login.internalAcess.user_data.User;

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
            Message.info("Falha ao realizar o login.");
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

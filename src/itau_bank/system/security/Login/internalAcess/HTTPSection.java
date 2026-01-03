package itau_bank.system.security.login.internalAcess;
import itau_bank.system.security.login.internalAcess.tools.Messages;
import itau_bank.tools.Message;
import itau_bank.system.security.login.internalAcess.tools.Options;
import itau_bank.user_data.User;

public class HTTPSection {
    // Attributes
    private User user;
    private Options options;
    private Messages messages;

    // Constructor
    public HTTPSection(User user) {
        this.user = user;
        this.options = new Options(user);
        this.messages = new Messages(user);

    }

    // Acessess methods
    public static void acessAccount(User user) {
        if(user == null) {
            Message.info("Falha ao realizar o login.");
            return;
        }
            HTTPSection section = new HTTPSection(user);
            section.menu();
    }

    // Client server
    private void menu() {
        messages.welcome();
        options.choice(user);
    }



}

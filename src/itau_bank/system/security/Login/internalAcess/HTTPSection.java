package itau_bank.system.security.login.internalAcess;
import itau_bank.tools.Message;
import itau_bank.system.security.login.internalAcess.tools.Options;
import itau_bank.user_data.User;


public class HTTPSection {
    // Attributes
    private User user;
    private Options options;

    // Constructor
    public HTTPSection(User user) {
        this.user = user;
        this.options = new Options(user);

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
        String welcome = String.format("Bem-vindo ao banco Itáu, %s.", user.getUsername());
        Message.info(welcome);
        options.choice(user);
    }



}

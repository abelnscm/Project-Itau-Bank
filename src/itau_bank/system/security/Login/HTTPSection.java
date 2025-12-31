package itau_bank.system.security.Login;
import itau_bank.tools.Message;
import itau_bank.user_data.User;
import javax.swing.*;

public class HTTPSection {
    // Attributes
    private User user;

    // Constructor
    public HTTPSection(User user) {
        this.user = user;
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
    public void menu() {
        String welcome = String.format("Bem-vindo ao banco Itáu, %s.", user.getUsername());
        Message.info(welcome);
        // Aqui será chamada a classe da interface JOptionPane.showOption
    }



}

package itau_bank.system.security.login.internalAcess.intefaces;
import itau_bank.system.security.login.internalAcess.user_data.User;
import javax.swing.*;

public class Messages {
    
    // Attribute 
    private User user;
    private String username;

    // Constructor
    public Messages(User user) {
        this.user = user;
        this.username = user.getUsername();
    }

    // Messages methods
    private String getWelcomeMessage() {
        return String.format("Bem-vindo ao banco Itaú, %s.", username);
    }

    public void welcome(){
        JOptionPane.showMessageDialog(null, getWelcomeMessage());
    }

    
    
}

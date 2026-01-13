package itau_bank.system.security.login.internal_access.menu.messages;
import itau_bank.system.security.login.internal_access.user_data.User;

import javax.swing.*;

public class Messages {
    
    // Attribute
    private final String username;

    // Constructor
    public Messages(User user) {
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

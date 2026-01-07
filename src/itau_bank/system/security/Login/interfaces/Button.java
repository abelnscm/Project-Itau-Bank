package itau_bank.system.security.login.interfaces;
import javax.swing.*;

public class Button {

    // Create button
    public static JButton login(){ // Botão de login
        JButton login = new JButton();

        final int WIDTH = 250;
        final int HEIGHT = 50;

        login.setLocation(255, 255);
        login.setSize(250,50);
        login.setText("Acessar minha conta");
        login.setBorderPainted(true);
        login.setFocusPainted(false);
        return login;
    }
}

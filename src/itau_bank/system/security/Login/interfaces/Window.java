package itau_bank.system.security.login.interfaces;
import javax.swing.*;

public class Window {
    public void login() {
        // Window configurations
        JFrame window = new JFrame();

        final int WIDTH = 620;
        final int HEIGHT = 480;

        window.setSize(WIDTH, HEIGHT);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(null);
        window.add(Button.login());
    }
}

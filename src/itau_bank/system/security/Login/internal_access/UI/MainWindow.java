package itau_bank.system.security.login.internal_access.UI;
import itau_bank.system.security.login.internal_access.UI.components.panels.login_panels.loginPanel;

import javax.swing.*;
import java.awt.*;

public class MainWindow {

    // Window section Login
    public void login() {
        JFrame window = new JFrame();

        // Size attributes
        final int WIDTH = 1280;
        final int HEIGHT = 720;
        window.setSize(WIDTH, HEIGHT);

        // Window configurations
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(new BorderLayout());
        window.setResizable(false);

        // Add methods
        window.add(loginPanel.show(), BorderLayout.EAST);

        // Window visibility
        window.setVisible(true);
    }

}

package itau_bank.system.security.UI;
import itau_bank.system.security.UI.resources.theme.Fonts;

import javax.swing.*;

public class MainWindow {

    // Window section Login
    public void login() {
        JFrame window = new JFrame();

        // Size attributes
        final int WIDTH = 800;
        final int HEIGHT = 560;
        final int FONT_SIZE = 12;
        window.setSize(WIDTH, HEIGHT);

        // Window configurations
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(null);
        window.setResizable(false);
        window.setFont(Fonts.CHANGE_FONT_BOLD(FONT_SIZE));

        // Add methods


        // Window visibility
        window.setVisible(true);
    }

}

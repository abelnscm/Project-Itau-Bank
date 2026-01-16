package itau_bank.system.UI.components;
import javax.swing.*;
import java.awt.*;

public class LoginPanel extends JPanel {
    public LoginPanel(JComponent containerCPF, JComponent containerPassword) {

        final int WIDTH = 500;
        final int HEIGHT = 720;

        setBackground(Color.BLUE);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));

        add(containerCPF, BorderLayout.CENTER);
        add(containerPassword, BorderLayout.CENTER);


    }
}

package itau_bank.system.UI.components;
import javax.swing.*;

public class AppWindow extends JFrame {
    public AppWindow(JComponent contentPanel) {

        final int WIDTH = 1280;
        final int HEIGHT = 720;

        setSize(WIDTH, HEIGHT);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(contentPanel);
        setVisible(true);

    }

}

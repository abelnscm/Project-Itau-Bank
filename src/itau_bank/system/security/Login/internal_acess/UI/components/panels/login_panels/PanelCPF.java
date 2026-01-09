package itau_bank.system.security.login.internal_acess.UI.components.panels.login_panels;
import javax.swing.*;
import java.awt.*;

public class PanelCPF {
    public static JPanel show(){
        JPanel panel = new JPanel();

        // Size attributes
        final int HEIGHT = 100;

        // Panel configuration
        panel.setPreferredSize(new Dimension(0, HEIGHT));
        panel.setBackground(Color.RED);
        panel.setLayout(new GridBagLayout());

        // Add methods

        return panel;
    }

}

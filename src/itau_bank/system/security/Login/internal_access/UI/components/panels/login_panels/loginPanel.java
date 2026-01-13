package itau_bank.system.security.login.internal_access.UI.components.panels.login_panels;

import javax.swing.*;
import java.awt.*;

public class loginPanel {

    public static JPanel show(){
        JPanel panel = new JPanel();

        // Size attributes
        final int WIDTH = 600;
        final int HEIGHT = 720;

        // Panel configuration
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        panel.setBackground(Color.BLUE);
        panel.setLayout(new GridBagLayout());

        // GBC Configurantions | Panel CPF
        GridBagConstraints gbcCPF = new GridBagConstraints();
        gbcCPF.gridx = 0;
        gbcCPF.gridy = 0;
        gbcCPF.weightx = 1.0;
        gbcCPF.fill = GridBagConstraints.HORIZONTAL;
        panel.add(PanelCPF.show(), gbcCPF);

        // GBC Configurantions | Panel Password
        GridBagConstraints gbcPassword = new GridBagConstraints();
        gbcPassword.gridx = 0;
        gbcPassword.gridy = 1;
        gbcPassword.weightx = 1.0;
        gbcPassword.fill = GridBagConstraints.HORIZONTAL;
        panel.add(PanelPassword.show(), gbcPassword);



        return panel;
    }
}

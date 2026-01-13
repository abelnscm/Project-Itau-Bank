package itau_bank.system.security.login.internal_access.UI.components;

import itau_bank.system.security.login.internal_access.UI.resources.theme.Fonts;

import javax.swing.*;
import java.awt.*;

public class Buttons {

    // Create button
    public static JButton button(String innerText, int y, int containerWidth){ // Botão de login
        JButton btn = new JButton();

        // Size configurantios
        final int WIDTH = 130;
        final int HEIGHT = 40;
        final int FONT_SIZE = 12;
        int x = (containerWidth - WIDTH) / 2;

        // Button configurations
        btn.setBounds(x, y, WIDTH, HEIGHT);
        btn.setText(innerText);
        btn.setBorderPainted(true);
        btn.setFocusPainted(false);
        btn.setBackground(new Color(252,111,3));
        btn.setFont(Fonts.CHANGE_FONT_BOLD(FONT_SIZE));
        btn.setBorder(BorderFactory.createLineBorder(null));
        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));

        return btn;
    }
}

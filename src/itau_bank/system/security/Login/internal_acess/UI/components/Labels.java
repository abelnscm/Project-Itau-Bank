package itau_bank.system.security.login.internal_acess.UI.components;
import itau_bank.system.security.login.internal_acess.UI.resources.theme.Fonts;

import javax.swing.*;

public class Labels {
    public static JLabel text(String innerText, int y, int containerWidth){
        JLabel text = new JLabel();

        // Size configuration
        final int WIDTH = 130;
        final int HEIGHT = 50;
        final int FONT_SIZE = 12;
        int x = (containerWidth - WIDTH) / 2;

        // Label configurations
        text.setVisible(true);
        text.setBounds(x, y, WIDTH, HEIGHT);
        text.setText(innerText);
        text.setFont(Fonts.CHANGE_FONT_BOLD(FONT_SIZE));
        return text;
    }
}

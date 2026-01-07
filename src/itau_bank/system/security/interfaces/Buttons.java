package itau_bank.system.security.interfaces;
import javax.swing.*;
import java.awt.*;

public class Buttons {

    // Create button
    public static JButton button(String innerText, int y, int containerWidth){ // Botão de login

        JButton button = new JButton();

        final int WIDTH = 130;
        final int HEIGHT = 40;
        int x = (containerWidth - WIDTH) / 2;

        button.setBounds(x, y, WIDTH, HEIGHT);
        button.setText(innerText);
        button.setBorderPainted(true);
        button.setFocusPainted(false);
        button.setBackground(new Color(252,111,3));

        return button;
    }
}

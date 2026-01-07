package itau_bank.system.security.interfaces;
import javax.swing.*;
import java.awt.*;

public class Inputs {

    public static JTextArea input (int y, int containerWidth){ // Campo para
        JTextArea input = new JTextArea();

        final int WIDTH = 130;
        final int HEIGHT = 20;
        int x = (containerWidth - WIDTH) / 2;

        input.setVisible(true);
        input.setBounds(x, y, WIDTH, HEIGHT);
        input.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        return input;
    }
    public static JPasswordField password(int y, int containerWidth){
        JPasswordField password = new JPasswordField();

        final int WIDTH = 130;
        final int HEIGHT = 20;
        int x = (containerWidth - WIDTH) / 2;

        password.setVisible(true);
        password.setBounds(x, y, WIDTH, HEIGHT);
        password.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        return password;
    }


}

package itau_bank.system.security.UI.resources;
import javax.swing.*;
import java.awt.*;

public class Inputs {

    public static JTextArea input (int y, int containerWidth){ // Campo para
        JTextArea input = new JTextArea();

        // Size configurantions
        final int WIDTH = 130;
        final int HEIGHT = 20;
        int x = (containerWidth - WIDTH) / 2;

        // Input configurations
        input.setVisible(true);
        input.setBounds(x, y, WIDTH, HEIGHT);
        input.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        return input;
    }

    public static JPasswordField password(int y, int containerWidth){
        JPasswordField password = new JPasswordField();

        // Size configurantions
        final int WIDTH = 130;
        final int HEIGHT = 20;
        int x = (containerWidth - WIDTH) / 2;

        // Input configurations
        password.setVisible(true);
        password.setBounds(x, y, WIDTH, HEIGHT);
        password.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        password.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        return password;
    }


}

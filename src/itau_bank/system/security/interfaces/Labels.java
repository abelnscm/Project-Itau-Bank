package itau_bank.system.security.interfaces;
import javax.swing.*;

public class Labels {
    public static JLabel text(String innerText, int y, int containerWidth){
        JLabel text = new JLabel();

        final int WIDTH = 130;
        final int HEIGHT = 50;
        int x = (containerWidth - WIDTH) / 2;

        text.setVisible(true);
        text.setBounds(x, y, WIDTH, HEIGHT);
        text.setText(innerText);
        return text;
    }
}

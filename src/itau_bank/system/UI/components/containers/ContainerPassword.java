package itau_bank.system.UI.components.containers;
import javax.swing.*;
import java.awt.*;

public class ContainerPassword extends JPanel {
    public ContainerPassword(){
        final int WIDTH = 150;
        final int HEIGHT = 150;

        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.RED);
        setLayout(new GridBagLayout());
    }
}

package itau_bank.system.UI.components;
import javax.swing.*;
import java.awt.*;

public class ContentPanel extends JPanel {
    public ContentPanel(JComponent loginPanel) {
        setLayout(new BorderLayout());
        add(loginPanel, BorderLayout.EAST);
    }
}

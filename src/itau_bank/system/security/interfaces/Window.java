package itau_bank.system.security.interfaces;
import javax.swing.*;

public class Window {
    public void login() {
        JFrame window = new JFrame();

        // Size methods
        final int WIDTH = 800;
        final int HEIGHT = 560;
        window.setSize(WIDTH, HEIGHT);

        // Window configurations
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(null);
        window.setResizable(false);

        // Add methods
        window.add(Labels.text("Digite seu CPF:",150, window.getWidth()));
        window.add(Inputs.input(190, window.getWidth()));
        window.add(Labels.text("Digite sua senha:",210, window.getWidth()));
        window.add(Inputs.password(250, window.getWidth()));
        window.add(Buttons.button("Acessar conta",290, window.getWidth()));

        // Window visibility
        window.setVisible(true);
    }
}

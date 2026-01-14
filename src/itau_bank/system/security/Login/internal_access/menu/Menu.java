package itau_bank.system.security.login.internal_access.menu;
import itau_bank.system.security.login.internal_access.data.User;
import javax.swing.*;

public class Menu {
    // Attributes
    private final Select select;

    // Constructor
    public Menu(User user) {
        this.select = new Select(user);
    }

    // Start method
    public void start(){
        final String[] options = {
                "Sacar","Depositar","PIX",
                "Ver saldo","Extrato","Sair"};

        final int choice = JOptionPane.showOptionDialog(
                null,
                "O que você deseja?",
                "Menu",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                options,
                options[0]
        );

        select.cases(choice);
    }
}

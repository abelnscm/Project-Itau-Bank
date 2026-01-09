package itau_bank.system.security.login.internal_acess.menu.options;
import itau_bank.system.security.login.internal_acess.user_data.User;
import javax.swing.*;

public class Menu {
    // Attributes
    private Select select;

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

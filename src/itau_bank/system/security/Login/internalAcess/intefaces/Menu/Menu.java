package itau_bank.system.security.login.internalAcess.intefaces.Menu;
import itau_bank.system.security.login.internalAcess.user_data.User;
import javax.swing.*;
import java.awt.*;

public class Menu {
    // Attributes
    private int choice;
    private Select select;

    // Constructor
    public Menu(User user) {
        this.select = new Select(user);
    }

    // Start method
    public void start(){
        String[] options = {
                "Sacar","Depositar","PIX",
                "Ver saldo","Extrato","Sair"};

        choice = JOptionPane.showOptionDialog(
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

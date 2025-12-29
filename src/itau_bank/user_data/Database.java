package itau_bank.user_data;
import javax.swing.*;
import java.util.ArrayList;

public class Database {
    // Attributes
    private ArrayList<User> users = new ArrayList<>();


    // Specific method
    public void add(User user) {
        users.add(user);
    }




    public void showUsers() {

        if (users.isEmpty()) { // Verifica se a lista está vazia
            JOptionPane.showMessageDialog(null, "Nenhum usuário cadastrado!");
        }

        System.out.println("===================================");
        System.out.println("LISTA DE USUÁRIOS");
        System.out.println("===================================");

        for (User user : users) { // Mostra todos os usuários
            System.out.println("Nome do usuário: " + user.getUsername());
            System.out.println("E-mail: " + user.getEmail());
            System.out.println("CPF: " + user.getCpf());
            System.out.println("Conta: " + user.getAccount().getAccountNumber());
            System.out.println("Agência: " + user.getAccount().getAgency());
            System.out.println("===================================");
        }


    }
}

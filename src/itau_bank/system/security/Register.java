package itau_bank.system.security;
import itau_bank.data_costumer.User;
import javax.swing.*;

public class Register {

    // Specific Methods
    public User register() {
        User user = new User();

        // e-mail
        user.setEmail(JOptionPane.showInputDialog("Insira um e-mail:"));
        while (user.getEmail() == null || user.getEmail().isEmpty()) { // Verifica se o usuário preencheu o campo
            JOptionPane.showMessageDialog(null, "O campo não pode estar vazio.");
            user.setEmail(JOptionPane.showInputDialog("Insira um e-mail:"));
        }

        // username
        user.setUsername(JOptionPane.showInputDialog("Escolha um nome de usuário:"));
        while (user.getUsername() == null || user.getUsername().isEmpty()) { // Verifica se o usuário preencheu o campo
            JOptionPane.showMessageDialog(null, "O campo não pode estar vazio.");
            user.setUsername(JOptionPane.showInputDialog("Escolha um nome de usuário:"));
        }

        // password
        user.setPassword(JOptionPane.showInputDialog("Crie uma senha de 6 dígitos:"));
        while (user.getPassword() == null || user.getPassword().isEmpty()) { // Verifica se o usuário preencheu o campo
            JOptionPane.showMessageDialog(null, "O campo não pode estar vazio.");
            user.setPassword(JOptionPane.showInputDialog("Crie uma senha de 6 dígitos:"));
        }

        // Confirm password
        String secondPassword = JOptionPane.showInputDialog("Repita sua senha:");
        while (!secondPassword.equals(user.getPassword())) { // Confirma se as senhas são iguais
            JOptionPane.showMessageDialog(null, "As senhas precisam ser iguais.");
            secondPassword = JOptionPane.showInputDialog("Repita sua senha:");
        }

        // CPF
        user.setCpf(JOptionPane.showInputDialog("Insira seu CPF para finalizar o cadastro:"));
        while (user.getCpf() == null || user.getCpf().isEmpty()) { // Verifica se o usuário preencheu o campo
            JOptionPane.showMessageDialog(null, "O campo não pode estar vazio.");
            user.setCpf(JOptionPane.showInputDialog("Insira seu CPF para finalizar o cadastro:"));
        }

        while (user.getCpf() == null || user.getCpf().length() != 11) { // Verifica se o CPF tem 11 dígitos
            JOptionPane.showMessageDialog(null, "CPF inválido!");
            user.setCpf(JOptionPane.showInputDialog("Insira seu CPF para finalizar o cadastro:"));
        }

        JOptionPane.showMessageDialog(null, "Cadastro finalizado.");



        ////////////////////////////////////////////////////////////////////////////////////////
        /// Log do sistema.
        ////////////////////////////////////////////////////////////////////////////////////////

        System.out.print("\n==========================================\n");
        System.out.print("CADASTRO DE USUÁRIOS");
        System.out.print("\n==========================================\n");
        System.out.printf(" \n 1. O usuário %s acabou de se cadastrar.\n 2. E-mail: %s\n 3. CPF: %s\n 4. Senha do usuário: %s\n",
                user.getUsername(), user.getEmail(), user.getCpf(), user.getPassword());
        System.out.print("\n==========================================");

        return user;


    }

}
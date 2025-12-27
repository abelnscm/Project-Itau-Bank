package itau_bank.system.security.user_authentication;
import itau_bank.user_data.Account;
import itau_bank.user_data.Database;
import itau_bank.user_data.User;
import javax.swing.*;

public class Register {

    // Attributes
    private Database database;
    public Register(Database database) {
        this.database = database;
    }

    // Specific Methods
    public User register() {

        // attributes
        Validation validation = new Validation();
        String email;
        String username;
        String password;
        String cpf;

        // e-mail
        email = (JOptionPane.showInputDialog("Insira um e-mail:"));
        while(validation.isNullOrEmpty(email)) { // Verifica se o usuário preencheu o campo
            JOptionPane.showMessageDialog(null, "O campo não pode estar vazio.");
            email = (JOptionPane.showInputDialog("Insira um e-mail:"));
        }

        // username
        username = (JOptionPane.showInputDialog("Escolha um nome de usuário:"));
        while(validation.isNullOrEmpty(username)) { // Verifica se o usuário preencheu o campo
            JOptionPane.showMessageDialog(null, "O campo não pode estar vazio.");
            username = (JOptionPane.showInputDialog("Escolha um nome de usuário:"));
        }

        // password
        password = (JOptionPane.showInputDialog("Crie uma senha de 6 dígitos:"));
        while (validation.isNullOrEmpty(password)) { // Verifica se o usuário preencheu
            JOptionPane.showMessageDialog(null, "O campo não pode estar vazio.");
            password = (JOptionPane.showInputDialog("Crie uma senha de 6 dígitos:"));
        }
        while (validation.isPasswordValid(password)) { // Verifica se a senha possui 6 dígitos
            JOptionPane.showMessageDialog(null, "A senha precisa ter 6 dígitos");
            password = (JOptionPane.showInputDialog("Crie sua senha:"));
        }

        // Confirm password
        String secondPassword;
        secondPassword = JOptionPane.showInputDialog("Repita sua senha:");
        while (validation.isNullOrEmpty(secondPassword)) { // Verifica se o campo está vazio
            JOptionPane.showMessageDialog(null, "O campo não pode estar vazio.");
            secondPassword = JOptionPane.showInputDialog("Repita sua senha:");
        }

        while(validation.isTwoPasswordValid(password, secondPassword)) { // Verifica se as senhas são iguais
            JOptionPane.showMessageDialog(null, "As senhas não podem ser diferentes.");
            secondPassword = JOptionPane.showInputDialog("Repita sua senha:");
        }

        // CPF
        cpf = (JOptionPane.showInputDialog("Insira seu CPF para finalizar o cadastro:"));
        while (validation.isNullOrEmpty(cpf)) { // Verifica se o usuário preencheu o campo
            JOptionPane.showMessageDialog(null, "O campo não pode estar vazio.");
            cpf = (JOptionPane.showInputDialog("Insira seu CPF para finalizar o cadastro:"));
        }
        while (validation.isCpfValid(cpf)) { // Verifica se o CPF tem 11 dígitos
            JOptionPane.showMessageDialog(null, "CPF inválido!");
            cpf = (JOptionPane.showInputDialog("Insira seu CPF para finalizar o cadastro:"));
        }

        Account account = new Account("0001", "00001"); // Cria uma conta
        User user = new User(username, email, password, cpf, account); // Constrói o usuário
        database.add(user);



        JOptionPane.showMessageDialog(null, "Cadastro finalizado.");



        ////////////////////////////////////////////////////////////////////////////////////////
        /// Log do sistema.
        ////////////////////////////////////////////////////////////////////////////////////////

        System.out.print("\n==========================================\n");
        System.out.print("CADASTRO DE USUÁRIO");
        System.out.print("\n==========================================\n");
        System.out.printf(" \n 1. O usuário %s acabou de se cadastrar.\n 2. E-mail: %s\n 3. CPF: %s\n 4. Senha do usuário: %s\n",
                username, email, cpf, "***********");

        return user;


    }

}
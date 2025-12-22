package system;

import javax.swing.JOptionPane;

public class itauBank {

    // Atributos da classe

    private String user;
    private String password;
    private String agency;
    private String cpf;
    private String bankAccount;
    private double balance = 0.0;


    // Constructor Method

    public itauBank(String user, String password, String cpf, String agency, String bankAccount){
        this.user = user;
        this.password = password;
        this.cpf = cpf;
        this.agency = agency;
        this.bankAccount = bankAccount;

    }

    // Specific Methods


    public void registerSignUp() {

        user = JOptionPane.showInputDialog("Usuário:");
        if(user.isEmpty()) {
            do {
                JOptionPane.showMessageDialog(null, "Esse campo não pode estar vazio.");
                user = JOptionPane.showInputDialog("Usuário:");

            } while (user.isEmpty());
        }
        password = JOptionPane.showInputDialog("Senha:");
        if(password.isEmpty()) {
            while (true) {
                JOptionPane.showMessageDialog(null, "Esse campo não pode estar vazio.");
                password = JOptionPane.showInputDialog("Senha:");
                if(!password.isEmpty()) {
                    inputClientData();
                    break;
                }

            }

        }
        inputClientData();
    }

    private void inputClientData() {

        cpf = JOptionPane.showInputDialog("CPF:");
        if(cpf.isEmpty()) {
            do {
                JOptionPane.showMessageDialog(null, "Esse campo não pode estar vazio.");
                cpf = JOptionPane.showInputDialog("CPF:");

            } while (cpf.isEmpty());
        }

        bankAccount = JOptionPane.showInputDialog("Conta bancária:");
        if(bankAccount.isEmpty()) {
            do {
                JOptionPane.showMessageDialog(null, "Esse campo não pode estar vazio.");
                bankAccount = JOptionPane.showInputDialog("Conta bancária:");

            } while (bankAccount.isEmpty());
        }
        agency = JOptionPane.showInputDialog("Agência:");
        if(agency.isEmpty()) {
            while(true) {
                JOptionPane.showMessageDialog(null, "Esse campo não pode estar vazio.");
                agency = JOptionPane.showInputDialog("Conta bancária:");

                if (!agency.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Encaminhando você para a tela de login.");
                    login();
                    break;
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Encaminhando você para a tela de login.");
            login();

        }

    }


    private String showInfo(){
        return "Bem-vindo a sua conta Itaú, " + user + ". \n" + "Agência: " + agency +
                "\n CPF: " + cpf + "\n Conta bancária: " + bankAccount + "\n Saldo da conta: " + balance;
    }

    private void login() {

        int attempts = 5;
        String userLogin, passwordLogin;
        userLogin = JOptionPane.showInputDialog("Nome de usuário para fazer login:");
        passwordLogin = JOptionPane.showInputDialog("Insira sua senha:");


        while (true) {

            if (userLogin.equals(user) && passwordLogin.equals(password)) {

                JOptionPane.showMessageDialog(null, "Login realizado com sucesso!");
//                depositar();
                JOptionPane.showMessageDialog(null, showInfo());
                break;

            } else {

                JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos. Tente novamente.");
                userLogin = JOptionPane.showInputDialog("Nome de usuário para fazer login:");
                passwordLogin = JOptionPane.showInputDialog("Insira sua senha:");
                attempts--;

            }

            if (attempts == 0) {
                JOptionPane.showMessageDialog(null, "Você excedeu o limite de tentativas!");
                break;
            }
        }
    }

    // Getters and Setters methods





}





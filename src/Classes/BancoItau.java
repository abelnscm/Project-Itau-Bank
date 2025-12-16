package Classes;
import javax.swing.JOptionPane;

public class BancoItau {

    // Atributos da classe

    private String user;
    private String password;
    private String agency;
    private String cpf;
    private String bankAccount;
    private double customerBalance = 0.0;


    public void depositar() {
        String costumerDeposit;
        costumerDeposit = JOptionPane.showInputDialog("Deposite qualquer valor acima de zero: ");
        double deposit = Double.parseDouble(costumerDeposit);

        while (true) {
            if (deposit > 0) {

                customerBalance += deposit;
                JOptionPane.showMessageDialog(null, "Valor de R$ " + deposit + "foi depositado com sucesso.");
                break;

            } else {
                JOptionPane.showMessageDialog(null, "Valor mínimo de R$ 1,00. Tente novamente!");
                costumerDeposit = JOptionPane.showInputDialog("Deposite qualquer valor acima de zero: ");
                deposit = Double.parseDouble(costumerDeposit);
            }

        }
    }

    // Specific Methods


    public void registerSignUp() {

        user = JOptionPane.showInputDialog("Usuário:");
        if(user.equals("")) {
            while (true) {
                JOptionPane.showMessageDialog(null, "Esse campo não estar vazio.");
                user = JOptionPane.showInputDialog("Usuário:");
                if(!user.equals("")) {
                    break;
                }
            }
        }
        password = JOptionPane.showInputDialog("Senha:");
        if(password.equals("")) {
            while (true) {
                JOptionPane.showMessageDialog(null, "Esse campo não estar vazio.");
                password = JOptionPane.showInputDialog("Usuário:");
                if(!password.equals("")) {
                    inputClientData();
                    break;
                }
            }
        }

    }

    private void inputClientData() {

        cpf = JOptionPane.showInputDialog("CPF:");
        if(cpf.equals("")) {
            while (true) {
                JOptionPane.showMessageDialog(null, "Esse campo não estar vazio.");
                cpf = JOptionPane.showInputDialog("CPF:");
                if(!cpf.equals("")) {
                    break;
                }
            }
        }

        bankAccount = JOptionPane.showInputDialog("Conta bancária:");
        if(bankAccount.equals("")) {
            while (true) {
                JOptionPane.showMessageDialog(null, "Esse campo não estar vazio.");
                bankAccount = JOptionPane.showInputDialog("Conta bancária:");
                if(!bankAccount.equals("")) {
                    break;
                }
            }
        }
        agency = JOptionPane.showInputDialog("Agência:");
        if(agency.equals("")) {
            while (true) {
                JOptionPane.showMessageDialog(null, "Esse campo não estar vazio.");
                agency = JOptionPane.showInputDialog("Insira sua agência:");
                if(!agency.equals("")) {
                    JOptionPane.showMessageDialog(null, "Encaminhando você para a janela de login!");
                    break;
                }
            }
        }

    }

    private String showInfo(){
        return "Bem-vindo a sua conta Itaú, " + user + ". \n" + "Agência: " + agency +
                "\n CPF: " + cpf + "\n Conta bancária: " + bankAccount + "\n Saldo da conta: " + customerBalance;
    }

    private void login() {

        int attempts = 5;
        String userLogin, passwordLogin;
        userLogin =  JOptionPane.showInputDialog("Nome de usuário para fazer login:");
        passwordLogin = JOptionPane.showInputDialog("Insira sua senha:");


        while(true) {

            if(userLogin.equals(user) && passwordLogin.equals(password)) {

                JOptionPane.showMessageDialog(null, "Login realizado com sucesso!");
                JOptionPane.showMessageDialog(null, showInfo());
                break;

            } else {

                JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos. Tente novamente.");
                userLogin =  JOptionPane.showInputDialog("Nome de usuário para fazer login:");
                passwordLogin = JOptionPane.showInputDialog("Insira sua senha:");
                attempts--;

            }

            if (attempts == 0) {
                JOptionPane.showMessageDialog(null, "Você excedeu o limite de tentativas!");
                break;
            }


    }




}
}

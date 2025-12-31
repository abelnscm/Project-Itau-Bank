package itau_bank.system.security.Register;
import itau_bank.tools.Input;
import itau_bank.tools.Message;
import itau_bank.user_data.Account;
import itau_bank.tools.AccountGenerator;
import itau_bank.user_data.Database;
import itau_bank.user_data.User;
import javax.swing.*;


public class Register {

    // Attributes
    private AccountGenerator acc = new AccountGenerator();
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
        String secondPassword;
        String CPF;
        String agency;
        String accountNumber;

        // e-mail
        email = Input.input("Insira um e-mail:");
        while(validation.isNullOrEmpty(email)) { // Verifica se o usuário preencheu o campo
            Message.info( "O campo não pode estar vazio.");
            email = Input.input("Insira um e-mail:");
        }

        // username
        username = Input.input("Escolha um nome de usuário:");
        while(validation.isNullOrEmpty(username)) { // Verifica se o usuário preencheu o campo
            Message.info("O campo não pode estar vazio.");
            username = Input.input("Escolha um nome de usuário:");
        }

        // password
        password = Input.input("Crie uma senha de 6 dígitos:");
        while (validation.isNullOrEmpty(password)) { // Verifica se o usuário preencheu
            Message.info("O campo não pode estar vazio.");
            password = Input.input("Crie uma senha de 6 dígitos:");
        }
        while (validation.isPasswordValid(password)) { // Verifica se a senha possui 6 dígitos
            Message.info("A senha precisa ter 6 dígitos");
            password = Input.input("Crie sua senha:");
        }

        // Confirm password
        secondPassword = Input.input("Repita sua senha:");
        while(validation.isTwoPasswordValid(password, secondPassword)) { // Verifica se as senhas são iguais
            Message.info("As senhas não podem ser diferentes.");
            secondPassword = Input.input("Repita sua senha:");
        }

        // CPF
        CPF = Input.input("Insira seu CPF para finalizar o cadastro:");
        while (validation.isNullOrEmpty(CPF)) { // Verifica se o usuário preencheu o campo
            Message.info("O campo não pode estar vazio.");
            CPF = Input.input("Insira seu CPF para finalizar o cadastro:");
        }
        while (validation.isCpfValid(CPF)) { // Verifica se o CPF tem 11 dígitos
            Message.info("CPF inválido!");
            CPF = Input.input("Insira seu CPF para finalizar o cadastro:");
        }

        do {agency = acc.generateAgency(); accountNumber = acc.generateAccount();} // Autenticação de conta bancária e agência
        while (database.accountExists(agency, accountNumber));

        Account account = new Account(agency, accountNumber); // A conta é atribuída ao usuário
        User user = new User(username, email, password, CPF, account); // Constrói o usuário
        database.add(user); // Adiciona no banco de dados (Database)
        Message.info("Cadastro finalizado.");


        ////////////////////////////////////////////////////////////////////////////////////////
        /// Log do sistema.
        ////////////////////////////////////////////////////////////////////////////////////////

        System.out.print("\n==========================================\n");
        System.out.print("CADASTRO DE USUÁRIO");
        System.out.print("\n==========================================\n");
        System.out.printf(" \n 1. O usuário %s acabou de se cadastrar.\n 2. E-mail: %s\n 3. CPF: %s\n 4. Senha do usuário: %s\n 5. Agência: %s " +
                "\n 6. Conta bancária:%s", username, email, CPF, "******", account.getAccountNumber(), account.getAgency());

        return user;

    }

}
package itau_bank.system.security.register;
import itau_bank.system.security.register.utils.Validation;
import itau_bank.utils.Input;
import itau_bank.utils.Message;
import itau_bank.system.security.login.internal_acess.user_data.Account;
import itau_bank.system.security.register.utils.AccountGenerator;
import itau_bank.system.security.login.internal_acess.user_data.Database;
import itau_bank.system.security.login.internal_acess.user_data.User;


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
        while(validation.isNullOrEmpty(email)) {
            Message.info( "O campo não pode estar vazio.");
            email = Input.input("Insira um e-mail:");
        }

        // username
        username = Input.input("Escolha um nome de usuário:");
        while(validation.isNullOrEmpty(username)) {
            Message.info("O campo não pode estar vazio.");
            username = Input.input("Escolha um nome de usuário:");
        }

        // password
        password = Input.input("Crie uma senha de 6 dígitos:");
        while (validation.isNullOrEmpty(password)) {
            Message.info("O campo não pode estar vazio.");
            password = Input.input("Crie uma senha de 6 dígitos:");
        }
        while (validation.isPasswordValid(password)) {
            Message.info("A senha precisa ter 6 dígitos");
            password = Input.input("Crie sua senha:");
        }

        // Confirm password
        secondPassword = Input.input("Repita sua senha:");
        while(validation.isTwoPasswordValid(password, secondPassword)) {
            Message.info("As senhas não podem ser diferentes.");
            secondPassword = Input.input("Repita sua senha:");
        }

        // CPF
        CPF = Input.input("Insira seu CPF para finalizar o cadastro:");
        while (validation.isNullOrEmpty(CPF)) {
            Message.info("O campo não pode estar vazio.");
            CPF = Input.input("Insira seu CPF para finalizar o cadastro:");
        }
        while (validation.isCpfValid(CPF)) {
            Message.info("CPF inválido!");
            CPF = Input.input("Insira seu CPF para finalizar o cadastro:");
        }

        do {agency = acc.generateAgency(); accountNumber = acc.generateAccount();}
        while (database.accountExists(agency, accountNumber));

        Account account = new Account(agency, accountNumber);
        User user = new User(username, email, password, CPF, account);
        account.setUser(user);
        database.add(user);
        Message.info("Cadastro finalizado.");

        return user;

    }

}
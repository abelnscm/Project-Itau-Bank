package itau_bank.system.security.register;
import itau_bank.system.security.register.utils.FormattedInput;
import itau_bank.system.security.register.utils.Validation;
import itau_bank.system.security.login.internal_access.user_data.Account;
import itau_bank.system.security.register.utils.AccountGenerator;
import itau_bank.system.security.login.internal_access.user_data.Database;
import itau_bank.system.security.login.internal_access.user_data.User;


public class Register {

    // Attributes
    private final AccountGenerator acc = new AccountGenerator();
    private final Database database;
    private final Validation validation = new Validation();


    // Constructor
    public Register(Database database) {
        this.database = database;
    }

    // Specific Methods
    public User register(String username,
                         String email,
                         String password,
                         String CPF,
                         String secondPassword
    ) {

        if (validation.isNullOrEmpty(email)) {
            throw new IllegalArgumentException("E-mail inválido.");
        }
        if (validation.isNullOrEmpty(username)) {
            throw new IllegalArgumentException("Usuário inválido.");
        }
        if (validation.isNullOrEmpty(password)) {
            throw new IllegalArgumentException("Senha inválida.");
        }
        if (!validation.isPasswordValid(password)) {
            throw new IllegalArgumentException("Senha deve ter 6 dígitos.");
        }
        if (!validation.isTwoPasswordValid(password, secondPassword)) {
            throw new IllegalArgumentException("As senhas precisam ser iguais.");
        }
        if (!validation.isCPFValid(CPF)) {
            throw new IllegalArgumentException("CPF inválido.");
        }

        String agency;
        String accountNumber;

        do {agency = acc.generateAgency(); accountNumber = acc.generateAccount();}
        while (database.accountExists(agency, accountNumber));

        Account account = new Account(agency, accountNumber);
        User user = new User(username, email, password, CPF, account);
        account.setUser(user);
        database.add(user);

        return user;

    }

}
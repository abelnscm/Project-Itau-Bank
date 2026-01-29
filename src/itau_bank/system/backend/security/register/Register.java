    package itau_bank.system.backend.security.register;
    import itau_bank.system.backend.security.exceptions.register.InvalidCpfException;
    import itau_bank.system.backend.security.exceptions.register.InvalidPasswordException;
    import itau_bank.system.backend.security.login.internal_access.data.Account;
    import itau_bank.system.backend.security.register.utils.AccountGenerator;
    import itau_bank.system.backend.security.login.internal_access.data.Database;
    import itau_bank.system.backend.security.login.internal_access.data.User;
    import itau_bank.system.backend.utils.Validation;


    public class Register {

        // Attributes
        private final AccountGenerator acc;
        private final Database database;
        private final Validation validation;

        // Constructor
        public Register(Database database, AccountGenerator accountGenerator, Validation validation) {
            this.database = database;
            this.acc = accountGenerator;
            this.validation = validation;
        }

        // Specific Methods
        public User register(String username,
                             String email,
                             String password,
                             String CPF,
                             String secondPassword
        ) {

            if (!validation.isPasswordValid(password)) {
                throw new InvalidPasswordException("A senha precisa ter 6 dígitos.");
            }
            if (!validation.isTwoPasswordValid(password, secondPassword)) {
                throw new InvalidPasswordException("As senhas precisam ser iguais.");
            }
            if (!validation.isCPFValid(CPF)) {
                throw new InvalidCpfException();
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
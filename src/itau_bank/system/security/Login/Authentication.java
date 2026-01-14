package itau_bank.system.security.login;
import itau_bank.system.security.login.internal_access.data.Database;
import itau_bank.system.security.login.internal_access.data.User;

public class Authentication {

    // Attributes
    private final Database database;
    private User user;
    private String CPF;
    private String password;

    // Constructor
    public Authentication(Database database,
                          String CPF,
                          String password)
    {
        this.database = database;
        this.CPF = CPF;
        this.password = password;
    }

    // Auth method
    public User authenticate() {
        for (User user : database.getDatabase()) {
            if (user.getCPF().equals(CPF) &&
                    user.getPassword().equals(password)) {
                return user;
            }
        }
        throw new IllegalArgumentException("CPF ou senha inválidos.");
    }




}

package itau_bank.system.backend.security.login.services;
import itau_bank.system.backend.security.exceptions.login.InvalidAuthenticationException;
import itau_bank.system.backend.security.login.domains.Database;
import itau_bank.system.backend.security.login.domains.User;

public class Authentication {

    // Attributes
    private final Database database;

    // Constructor
    public Authentication(Database database) {
        this.database = database;
    }

    // Auth method
    public User authenticate(String CPF, String password) {
        for (User user : database.getDatabase()) {
            if (user.getCPF().equals(CPF) &&
                    user.getPassword().equals(password)) {
                return user;
            }
        }
        throw new InvalidAuthenticationException();
    }




}

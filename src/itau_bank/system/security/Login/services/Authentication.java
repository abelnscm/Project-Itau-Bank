package itau_bank.system.security.login.services;
import itau_bank.system.security.exceptions.login.InvalidAuthenticationException;
import itau_bank.system.security.login.internal_access.data.Database;
import itau_bank.system.security.login.internal_access.data.User;

public class Authentication {

    // Attributes
    private final Database database;
    private User user;


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

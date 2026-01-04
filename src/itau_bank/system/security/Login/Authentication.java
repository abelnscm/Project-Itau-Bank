package itau_bank.system.security.login;
import itau_bank.system.security.register.tools.Validation;
import itau_bank.system.security.login.internalAcess.user_data.Database;
import itau_bank.system.security.login.internalAcess.user_data.User;

public class Authentication {

    // Attributes
    private Validation validation;
    private Database database;
    private User user;

    // Constructor
    public Authentication(Database database) {
        this.database = database;
        this.validation = new Validation();
    }

    // Auth method
    public User auth(String CPF, String password) {
        for(User user : database.getDatabase()){
            boolean sameCPF = user.getCPF().equals(CPF);
            boolean samePassword = user.getPassword().equals(password);

            if(sameCPF && samePassword) {
                return user;
            }
        }
        return null;
    }


}

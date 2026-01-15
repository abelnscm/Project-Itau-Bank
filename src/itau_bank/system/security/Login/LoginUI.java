package itau_bank.system.security.login;
import itau_bank.system.security.login.internal_access.data.Database;
import itau_bank.system.security.login.internal_access.data.User;
import itau_bank.system.security.login.utils.FormattedInput;
import itau_bank.system.utils.Message;

public class LoginUI {

    // Attributes
    private final Database database;
    private FormattedInput input;

    // Constructor
    public LoginUI(Database database, FormattedInput formattedInput) {
        this.database = database;
        this.input = formattedInput;
    }

    // Specific methods
    public User start() {
        while(true) {
            try {
                String CPF = input.requiredCPF("Insira seu CPF");
                String password = input.requiredPassword("Insira sua senha");
                Authentication auth = new Authentication(database, CPF, password);
                return auth.authenticate();

            } catch (IllegalArgumentException e) {
                Message.info(e.getMessage());
            }
        }


    }


    }



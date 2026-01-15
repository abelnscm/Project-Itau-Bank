package itau_bank.system.security.login;
import itau_bank.system.security.exceptions.login.LoginException;
import itau_bank.system.security.login.internal_access.data.Database;
import itau_bank.system.security.login.internal_access.data.User;
import itau_bank.system.security.login.services.Authentication;
import itau_bank.system.utils.FormattedInput;
import itau_bank.system.utils.Message;

public class LoginUI {

    // Attributes
    private final Database database;
    private FormattedInput input;
    private Authentication authentication;

    // Constructor
    public LoginUI(Database database, FormattedInput formattedInput, Authentication authentication) {
        this.database = database;
        this.input = formattedInput;
        this.authentication = authentication;
    }

    // Specific methods
    public User start() {
        while(true) {
            try {
                String CPF = input.requiredCPF("Insira seu CPF");
                String password = input.requiredPassword("Insira sua senha");
                return authentication.authenticate(CPF, password);

            } catch (LoginException e) {
                Message.info(e.getMessage());
            }
        }


    }


    }



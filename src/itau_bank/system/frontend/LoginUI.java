package itau_bank.system.frontend;
import itau_bank.system.backend.security.exceptions.login.InvalidAuthenticationException;
import itau_bank.system.frontend.utils.FormattedInput;
import itau_bank.system.frontend.utils.Message;
import itau_bank.system.backend.security.login.domains.Database;
import itau_bank.system.backend.security.login.domains.User;
import itau_bank.system.backend.security.login.services.Authentication;

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

            } catch(InvalidAuthenticationException e) {
                Message.info(e.getMessage());
            }
        }


    }


    }



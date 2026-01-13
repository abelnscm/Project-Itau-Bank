package itau_bank.system.security.login;
import itau_bank.system.security.register.utils.Validation;
import itau_bank.system.utils.Input;
import itau_bank.system.utils.Message;
import itau_bank.system.security.login.internal_access.user_data.Database;
import itau_bank.system.security.login.internal_access.user_data.User;

public class Login {

    // Attributes
    private Authentication auth;
    private Database database;
    private Validation validation;
    private User user;

    // Constructor
    public Login(Database database) {
        this.database = database;
        this.auth = new Authentication(database);
        this.validation = new Validation();
    }

    // Specific methods
    public User login() {
        Message.info("Iniciando sessão de login....");

        // Attributes
        int attempts = 8;

        while (attempts > 0) {
            String CPF = inputRequired("Insira seu CPF:");
            String password = inputRequired("Insira sua senha:");
            user = auth.auth(CPF, password);

            if (user != null) {
                return user;
            }

            attempts--;
            Message.info("Usuário não encontrado");
        }

        Message.info("Você excedeu o limite de tentativas. Tente novamente mais tarde.");
        return null;

    }

    // Required Method
    private String inputRequired(String message) {
        String value = Input.input(message);
        while (validation.isNullOrEmpty(value)) {
            Message.info("O campo não pode estar vazio.");
            value = Input.input(message);
        }
        return value;
    }


}

package itau_bank.system.security.login;
import itau_bank.system.security.register.tools.Validation;
import itau_bank.tools.Input;
import itau_bank.tools.Message;
import itau_bank.system.security.login.internalAcess.user_data.Database;
import itau_bank.system.security.login.internalAcess.user_data.User;

public class Login {

    // Attributes
    private Authentication auth;
    private Database database;
    private Validation validation;

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
        String CPF;
        String password;

        // Inputs
        CPF = inputRequired("Insira seu CPF:");
        password = inputRequired("Insira sua senha:");
        User user = auth.auth(CPF, password); // Verificação no banco de dados

        if (user != null) {
            Message.info("Usuário logado com sucesso!");
            return user;
        } else {
            Message.info("Usuário não encontrado.");
            return null;
        }
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

package itau_bank.system.security.Login;
import itau_bank.tools.Input;
import itau_bank.tools.Message;
import itau_bank.user_data.Database;

public class Login {

    // Attributes
    private Authentication auth;
    private Database database;

    // Constructor
    public Login(Database database) {
        this.database = database;
    }

    // Specific methods
    public boolean login() {

        Message.info("Iniciando sessão de login....");
        if(auth.auth(Input.input("Insira seu CPF:"),Input.input("Insira sua senha:"))){


        };
        return true;
    }


}

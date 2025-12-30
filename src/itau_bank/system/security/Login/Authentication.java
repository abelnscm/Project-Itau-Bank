package itau_bank.system.security.Login;
import itau_bank.system.security.Register.Validation;
import itau_bank.user_data.Database;
import itau_bank.tools.Message;
import itau_bank.user_data.User;

public class Authentication {


    // Attributes
    private Validation validation = new Validation();
    private Database database;
    private User user;

    // Constructor
    public Authentication(Database database) {
        this.database = database;
    }

    // Auth method
    public boolean auth(String CPF, String password){

        if(validation.isNullOrEmpty(CPF) || validation.isNullOrEmpty(password)){
            Message.info("Insira seu CPF e sua senha.");
        }
        if(validation.isNullOrEmpty(CPF) && validation.isNullOrEmpty(password)){
            Message.info("Preencha os campos para fazer login.");
        }
        for(User db: database.getDatabase()) {
            if(validation.isNullOrEmpty(db.getCPF()) || validation.isNullOrEmpty(db.getPassword())){
                Message.info("Usuário não encontrado.");
            }
            if(validation.isNullOrEmpty(db.getCPF()) && validation.isNullOrEmpty(db.getPassword())){
                Message.info("Usuário não encontrado.");
            }

        }
        return true;

    }
}

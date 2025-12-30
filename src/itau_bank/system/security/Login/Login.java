package itau_bank.system.security.Login;
import itau_bank.system.security.Register.Validation;
import itau_bank.tools.Input;
import itau_bank.tools.Message;
import itau_bank.user_data.Database;

import javax.swing.*;

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
    public void login() {

        Message.info("Iniciando sessão de login....");

        // Attributes
        String CPF;
        String password;

        // Inputs
        CPF = inputRequired("Insira seu CPF:");
        password = inputRequired("Insira sua senha:");

        if(auth.auth(CPF, password)) {
            Message.info("O usuário está logado.");
        } else {
            Message.info("Usuário não encontrado");

        }

    }

    // Required Method
    public String inputRequired(String message) {
        String value = Input.input(message);
        while (validation.isNullOrEmpty(value)) {
            Message.info("O campo não pode estar vazio.");
            value = Input.input(message);
        }
        return value;
    }


}

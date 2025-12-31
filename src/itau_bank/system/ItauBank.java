package itau_bank.system;
import itau_bank.system.security.Login.HTTPSection;
import itau_bank.system.security.Login.Login;
import itau_bank.user_data.Database;
import itau_bank.user_data.User;
import itau_bank.system.security.Register.Register;

import javax.swing.*;

public class ItauBank {
    public static void main(String[] args) {

        // attributes
        Database db = new Database();
        Register register = new Register(db);
        Login login = new Login(db);

        // Methods executions
        User user001 = register.register();
        User loggedUser = login.login();
        HTTPSection.acessAccount(loggedUser);
}
}







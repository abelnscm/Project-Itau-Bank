package itau_bank.system;
import itau_bank.system.security.login.interfaces.Window;
import itau_bank.system.security.login.internalAcess.HTTPSection;
import itau_bank.system.security.login.Login;
import itau_bank.system.security.login.internalAcess.user_data.Database;
import itau_bank.system.security.login.internalAcess.user_data.User;
import itau_bank.system.security.register.Register;

public class ItauBank {
    public static void main(String[] args) {

//        // attributes
//        Database db = new Database();
//        Register register = new Register(db);
//        Login login = new Login(db);
//
//        // Methods executions
//        User user001 = register.register();
//        User loggedUser = login.login();
//        HTTPSection.acessAccount(loggedUser);

        Window window = new Window();
        window.login();
}
}







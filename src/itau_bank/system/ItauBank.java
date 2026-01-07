package itau_bank.system;
import itau_bank.system.security.interfaces.Window;

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







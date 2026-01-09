package itau_bank.system;
import itau_bank.system.security.login.internal_acess.UI.MainWindow;

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

          MainWindow window = new MainWindow();
          window.login();
}
}







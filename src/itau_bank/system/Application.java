package itau_bank.system;
import itau_bank.system.security.login.HTTP;
import itau_bank.system.security.login.LoginUI;
import itau_bank.system.security.login.internal_access.data.Database;
import itau_bank.system.security.login.internal_access.data.User;
import itau_bank.system.security.register.Register;
import itau_bank.system.security.register.RegisterUI;

public class Application {
    public static void start() {

        Database db = new Database();
        Register register = new Register(db);
        RegisterUI registerUI = new RegisterUI(register);
        LoginUI login = new LoginUI(db);


        registerUI.start();
        User user = login.start();
        HTTP.start(user);




    }
}

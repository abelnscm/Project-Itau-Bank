package itau_bank.system;
import itau_bank.system.security.login.internal_access.user_data.Database;
import itau_bank.system.security.register.Register;
import itau_bank.system.security.register.RegisterUI;

public class Application {
    public static void start() {

        Database db = new Database();
        Register register = new Register(db);
        RegisterUI registerUI = new RegisterUI(register);

        registerUI.start();

    }
}

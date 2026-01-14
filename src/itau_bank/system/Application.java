package itau_bank.system;
import itau_bank.system.security.login.HTTP;
import itau_bank.system.security.login.LoginUI;
import itau_bank.system.security.login.internal_access.data.Database;
import itau_bank.system.security.login.internal_access.data.User;
import itau_bank.system.security.register.Register;
import itau_bank.system.security.register.RegisterUI;

public class Application {

    private final Database database;
    private final Register register ;
    private final RegisterUI registerUI;
    private final LoginUI login;

    // Constructor
    public Application() {
        this.database = new Database();
        this.register  = new Register(database);
        this.registerUI = new RegisterUI(register);
        this.login = new LoginUI(database);

    }

    // Inicalizate method
    public void start() {
        registerUI.start();
        User user = login.start();
        HTTP.start(user);
    }
}

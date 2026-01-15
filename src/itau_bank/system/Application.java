package itau_bank.system;
import itau_bank.system.security.login.HTTP;
import itau_bank.system.security.login.LoginUI;
import itau_bank.system.security.login.internal_access.data.Database;
import itau_bank.system.security.login.internal_access.data.User;
import itau_bank.system.security.login.utils.FormattedInput;
import itau_bank.system.security.register.Register;
import itau_bank.system.security.register.RegisterUI;
import itau_bank.system.security.register.utils.AccountGenerator;
import itau_bank.system.security.register.utils.Validation;

public class Application {

    private final Database database;
    private final Register register ;
    private final RegisterUI registerUI;
    private final LoginUI login;
    private final FormattedInput formattedInput;
    private final AccountGenerator acc;
    private final Validation validation;

    // Constructor
    public Application() {
        this.database = new Database();
        this.acc = new AccountGenerator();
        this.formattedInput = new FormattedInput();
        this.validation = new Validation();
        this.register  = new Register(database, acc, validation);
        this.registerUI = new RegisterUI(register);
        this.login = new LoginUI(database, formattedInput);

    }

    // Inicalizate method
    public void start() {
        registerUI.start();
        User user = login.start();
        HTTP.start(user);
    }
}

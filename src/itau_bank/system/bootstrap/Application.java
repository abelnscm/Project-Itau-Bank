package itau_bank.system.bootstrap;
import itau_bank.system.security.login.services.HTTP;
import itau_bank.system.security.login.LoginUI;
import itau_bank.system.security.login.internal_access.data.User;
import itau_bank.system.security.register.RegisterUI;


public class Application {

    private final RegisterUI registerUI;
    private final LoginUI login;

    public Application(RegisterUI registerUI, LoginUI login) {
        this.registerUI = registerUI;
        this.login = login;
    }

    public void start() {
        registerUI.start();
        User user = login.start();
        HTTP.start(user);
    }
}

package itau_bank.system.backend.app;
import itau_bank.system.backend.security.login.services.HTTP;
import itau_bank.system.frontend.LoginUI;
import itau_bank.system.backend.security.login.internal_access.data.User;
import itau_bank.system.frontend.RegisterUI;


public class App {

    private final RegisterUI registerUI;
    private final LoginUI login;

    public App(RegisterUI registerUI, LoginUI login) {
        this.registerUI = registerUI;
        this.login = login;
    }

    public void start() {
        registerUI.start();
        User user = login.start();
        HTTP.start(user);
    }
}

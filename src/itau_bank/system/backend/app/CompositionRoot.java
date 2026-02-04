package itau_bank.system.backend.app;

import itau_bank.system.frontend.LoginUI;
import itau_bank.system.backend.security.login.domains.Database;
import itau_bank.system.backend.security.login.services.Authentication;
import itau_bank.system.backend.security.register.Register;
import itau_bank.system.frontend.RegisterUI;
import itau_bank.system.backend.security.register.AccountGenerator;
import itau_bank.system.frontend.utils.FormattedInput;
import itau_bank.system.backend.utils.Validation;

public class CompositionRoot {
    public App build() {
        Database database = new Database();
        Validation validation = new Validation();
        FormattedInput formattedInput = new FormattedInput(validation);
        AccountGenerator acc = new AccountGenerator();
        Authentication auth = new Authentication(database);
        Register register = new Register(database, acc, validation);
        RegisterUI registerUI = new RegisterUI(register, formattedInput);
        LoginUI loginUI = new LoginUI(database, formattedInput, auth);

        return new App(registerUI, loginUI);
    }
}

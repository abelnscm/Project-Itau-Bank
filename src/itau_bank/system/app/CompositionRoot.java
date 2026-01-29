package itau_bank.system.app;

import itau_bank.system.security.login.LoginUI;
import itau_bank.system.security.login.internal_access.data.Database;
import itau_bank.system.security.login.services.Authentication;
import itau_bank.system.security.register.Register;
import itau_bank.system.security.register.RegisterUI;
import itau_bank.system.security.register.utils.AccountGenerator;
import itau_bank.system.utils.FormattedInput;
import itau_bank.system.utils.Validation;

public class CompositionRoot {
    public Application build() {

        Database database = new Database();
        Validation validation = new Validation();
        FormattedInput formattedInput = new FormattedInput(validation);
        AccountGenerator acc = new AccountGenerator();
        Authentication auth = new Authentication(database);
        Register register = new Register(database, acc, validation);
        RegisterUI registerUI = new RegisterUI(register, formattedInput);
        LoginUI loginUI = new LoginUI(database, formattedInput, auth);

        return new Application(registerUI, loginUI);
    }
}

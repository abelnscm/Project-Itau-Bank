package itau_bank.system;
import itau_bank.system.security.Login.Login;
import itau_bank.user_data.Database;
import itau_bank.user_data.User;
import itau_bank.system.security.Register.Register;

public class ItauBank {
    public static void main(String[] args) {

        // attributes
        Database db = new Database();
        Register register = new Register(db);
        Login login001 = new Login(db);

        // Methods executions
        User user001 = register.register();
        login001.login();




}
}







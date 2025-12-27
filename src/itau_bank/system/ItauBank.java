package itau_bank.system;
import itau_bank.user_data.Database;
import itau_bank.user_data.User;
import itau_bank.system.security.user_authentication.Register;

public class ItauBank {
    public static void main(String[] args) {
        Database db = new Database();
        Register register = new Register(db);
        User user001 = register.register();
        db.showUsers();

    }
}







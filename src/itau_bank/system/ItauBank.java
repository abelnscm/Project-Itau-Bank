package itau_bank.system;
import itau_bank.data_costumer.User;
import itau_bank.system.security.user_authentication.Register;

public class ItauBank {
    public static void main(String[] args) {
        Register register = new Register();
        User user001 = register.register();
    }
}







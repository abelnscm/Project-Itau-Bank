package itau_bank.user_data;
import java.util.Random;

public class AccountGenerator {
    Random random = new Random();

    // Specifics methods

    public String generateAgency() {
        int agency = random.nextInt(10000);
        String convertedAgency = String.format("%04d", agency);
        return convertedAgency;
    }
    public String generateAccount() {
        int account = random.nextInt(1000000);
        String convertedAccount = String.format("%06d", account);
        return convertedAccount;
    }
}

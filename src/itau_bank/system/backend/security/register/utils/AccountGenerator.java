package itau_bank.system.backend.security.register.utils;
import java.util.Random;

public class AccountGenerator {
    Random random = new Random();

    // Specifics methods
    public String generateAgency() { // Gera uma agência com 4 dígitos
        int agency = random.nextInt(10000);
        String convertedAgency = String.format("%04d", agency);
        return convertedAgency;
    }

    public String generateAccount() { // Gera uma conta bancária com 6 dígitos
        int account = random.nextInt(1000000);
        String convertedAccount = String.format("%06d", account);
        return convertedAccount;
    }
}

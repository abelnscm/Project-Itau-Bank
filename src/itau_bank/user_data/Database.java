package itau_bank.user_data;
import javax.swing.*;
import java.util.ArrayList;

public class Database {
    // Attributes
    private ArrayList<User> users = new ArrayList<>();

    // Specific method
    public void add(User user) {
        users.add(user);
    }

    public boolean accountExists(String agency, String accountNumber){
        for(User user : users){

            Account acc = user.getAccount();
            boolean sameAgency = acc.getAgency().equals(agency);
            boolean sameAccountNumber = acc.getAccountNumber().equals(accountNumber);

            if(sameAgency && sameAccountNumber){
                return true;
            }
        }
        return false;
    }

    public ArrayList<User> getDatabase() {
        return this.users;
    }


}

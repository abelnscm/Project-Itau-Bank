package itau_bank.system.security.login.internalAcess.user_data;
import itau_bank.system.security.login.internalAcess.operationsSections.Extract;
import itau_bank.utils.Message;


public class Account {
    // Attributes
    private String agency;
    private String accountNumber;
    private double balance;
    private User user;
    private Extract extract = new Extract();

    // Constructor
    public Account(String agency, String accountNumber) {
        this.agency = agency;
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    // Financial methods
    public boolean withdrawal(Double amount){ // Realiza um saque
        if(amount < 20){
            return false;
        }
        if(amount > this.balance) {
            return false;
        }
        this.balance -= amount;
        return true;
    }

    public boolean deposit(Double amount) { // Deposita um valor na conta
        if(amount < 0.25) {
            return false;
        }
        this.balance += amount;
        return true;
    }

    public boolean PIX(double value){
        while(value < 0.10) {
            return false;
        }
        this.balance -= value;
        return true;

    }

    // Getters
    public String getAgency() {
        return agency;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public User getUser() {
        return user;
    }
    public double getBalance(){
        return this.balance;
    }

    public Extract getExtract() {
        return extract;
    }



    // Setters
    public void setUser(User user) {
        this.user = user;
    }
}



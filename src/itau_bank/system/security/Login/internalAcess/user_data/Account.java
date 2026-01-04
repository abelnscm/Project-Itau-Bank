package itau_bank.system.security.login.internalAcess.user_data;
import itau_bank.system.security.login.internalAcess.operationsSections.PIX;
import itau_bank.system.security.register.tools.Validation;
import itau_bank.tools.Message;


public class Account {
    // Attributes
    private String agency;
    private String accountNumber;
    private double balance;
    private Validation validation;
    private User user;
    private PIX PIX;

    // Constructor
    public Account(String agency, String accountNumber) {
        this.agency = agency;
        this.accountNumber = accountNumber;
        this.balance = 0;
        this.validation = new Validation();

    }

    // Financial methods
    public void withdrawal(Double amount){ // Realiza um saque
        if(amount < 20){
            Message.info("O valor mínimo para saque é de R$ 20,00");
            return;
        }
        if(amount > this.balance) {
            Message.info("Você não tem saldo suficiente.");
            return;
        }
        this.balance -= amount;
        Message.info("Saque realizado com sucesso!");
    }

    public void deposit(Double amount) { // Deposita um valor na conta
        if(amount < 0.25) {
            Message.info("O valor mínimo para depósito é de R$ 0,25");
            return;
        }
        Message.info("Depósito realizado com sucesso!");
        this.balance += amount;
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

    // Setters
    public void setUser(User user) {
        this.user = user;
    }
}



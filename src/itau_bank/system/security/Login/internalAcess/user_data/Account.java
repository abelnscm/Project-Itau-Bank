package itau_bank.system.security.login.internalAcess.user_data;
import itau_bank.system.security.login.internalAcess.operationsSections.Extract;
import itau_bank.tools.Message;
import itau_bank.tools.TimeDate;


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
        String depositConverted = String.valueOf(amount);
        String message = String.format("Você depositou R$ %s às %s.", depositConverted, TimeDate.now());
        extract.add(message);
        this.balance += amount;
    }

    public void PIX(double value){
        while(value < 0.10) {
            Message.info("O valor mínimo de transferência via PIX é de R$ 0,10");
            return;
        }
        this.balance -= value;
        Message.info("Pix realizado com sucesso!");
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

    // Setters
    public void setUser(User user) {
        this.user = user;
    }
}



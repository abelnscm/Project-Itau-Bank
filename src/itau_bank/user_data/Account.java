package itau_bank.user_data;
import itau_bank.tools.Message;


public class Account {
    // Attributes
    private String agency;
    private String accountNumber;
    private double balance;

    // Constructor
    public Account(String agency, String accountNumber) {
        this.agency = agency;
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    // Financial methods
    public void deposit(Double value) {
      this.balance += value;
    }
    public void withdraw(Double value){
        if(value <= 0) {
            Message.info("O valor mínimo para saque é de R$ 20,00.");
        } else if (value > this.balance) {
            Message.info("Você não tem saldo suficiente para efetuar essa transação.");
        } else {
            this.balance -= value;
        }
    }

    // Getters
    public String getAgency() {
        return agency;
    }
    public String getAccountNumber() {
        return accountNumber;
    }



}



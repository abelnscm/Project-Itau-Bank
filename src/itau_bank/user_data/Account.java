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
        this.balance = 0;
    }

    // Financial methods
    public void withdrawal(Double amount){
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


    // Getters
    public String getAgency() {
        return agency;
    }
    public String getAccountNumber() {
        return accountNumber;
    }





}



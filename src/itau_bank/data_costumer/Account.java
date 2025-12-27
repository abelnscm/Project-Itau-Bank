package itau_bank.data_costumer;

public class Account {
    // Attributes
    private String agency;
    private String accountNumber;
    private double balance;

    public Account(String agency, String accountNumber) {
        this.agency = agency;
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public String getAgency() {
        return agency;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}



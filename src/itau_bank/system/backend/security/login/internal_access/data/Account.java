package itau_bank.system.backend.security.login.internal_access.data;
import itau_bank.system.backend.security.exceptions.account.InsufficientBalanceException;
import itau_bank.system.backend.security.exceptions.account.InvalidAmountException;
import itau_bank.system.backend.security.exceptions.account.MinValueException;
import itau_bank.system.backend.security.login.internal_access.transactions.Extract;

public class Account {

    // CONSTANTS
    private static final double MIN_PIX = 0.10;
    private static final double MIN_WITHDRAWAL = 20.00;
    private static final double MIN_DEPOSIT = 0.25;
    private static final double MIN_AMOUNT = 0;

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
    public void withdrawal(double amount){

        if(amount <= MIN_AMOUNT) {
            throw new InvalidAmountException();
        }
        if(amount < MIN_WITHDRAWAL){
            throw new MinValueException(MIN_WITHDRAWAL);
        }
        if(amount > balance) {
            throw new InsufficientBalanceException("Seu saldo é insuficiente para esta transação.");
        }

        balance -= amount;
    }

    public void deposit(double amount) {

        if(amount <= MIN_AMOUNT) {
            throw new InvalidAmountException();
        }
        if(amount < MIN_DEPOSIT) {
            throw new MinValueException(MIN_DEPOSIT);
        }
        balance += amount;
    }

    public void PIX(double value){

        if(value <= MIN_AMOUNT) {
            throw new InvalidAmountException();
        }
        if(value < MIN_PIX) {
            throw new MinValueException(MIN_PIX);
        }
        if (value > balance) {
            throw new InsufficientBalanceException("Saldo insuficiente para o PIX.");
        }

        balance -= value;

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



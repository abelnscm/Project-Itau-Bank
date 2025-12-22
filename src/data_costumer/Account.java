package data_costumer;

import javax.swing.*;

public class Account {

    // Attributes
    private String agency;
    private String accountNumber;
    private double balance = 0.0;

    // Constructor Method

    public Account(String agency, String accountNumber, double balance) {
        this.agency = agency;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Specifics methods

    public void deposit(){
        String costumerDeposit;
        costumerDeposit = JOptionPane.showInputDialog("Deposite qualquer valor acima de zero: ");
        double convertedDeposit = Double.parseDouble(costumerDeposit);

        while (true) {
            if (convertedDeposit > 0) {

                convertedDeposit += balance;
                JOptionPane.showMessageDialog(null, "Valor de R$ " + convertedDeposit + " foi depositado com sucesso.");
                break;

            } else {
                JOptionPane.showMessageDialog(null, "Valor mínimo de R$ 1,00. Tente novamente!");
                costumerDeposit = JOptionPane.showInputDialog("Deposite qualquer valor acima de zero: ");
                convertedDeposit = Double.parseDouble(costumerDeposit);
            }

        }
    };


    // Getters and Setters

    private String getAgency() {
        return agency;
    }

    private String getAccountNumber() {
        return accountNumber;
    }

    private double getBalance() {
        return balance;
    }
}

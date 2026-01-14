package itau_bank.system.security.login.utils;

public class Validation {

    // Specific methods
    public boolean isNullOrEmpty(String value) {
        return value == null || value.isEmpty();
    }
    public boolean isPasswordValid(String password) {
        return password != null && password.length() == 6;
    }
    public boolean isTwoPasswordValid(String passwordOne, String passwordTwo){
        return passwordOne.equals(passwordTwo);
    }
    public boolean isCPFValid(String CPF) { // Verifica se o CPF é válido
        return CPF != null && CPF.length() == 11;
    }
}

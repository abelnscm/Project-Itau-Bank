package itau_bank.system.security.Register;

public class Validation {

    // Specific methods
    public boolean isNullOrEmpty(String value) {  // Verifica se o usuário digitou ou cancelou (NUll)
        return value == null || value.isEmpty();
    }
    public boolean isPasswordValid(String password) { // Verifica se a senha possui 6 dígitos
        return password != null && password.length() != 6;
    }
    public boolean isTwoPasswordValid(String passwordOne, String passwordTwo){ // Verifica se as senhas são iguais
        return !passwordOne.equals(passwordTwo);
    }
    public boolean isCpfValid(String cpf) { // Verifica se o CPF é válido
        return cpf == null || cpf.length() != 11;
    }
}

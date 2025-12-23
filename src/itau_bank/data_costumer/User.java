package itau_bank.data_costumer;

public class User {

    // Attributes
    private String username;
    private String email;
    private String password;
    private String cpf;


    // Specific methods

    // Getters
    protected String getUsername() {
        return username;
    }

    protected String getPassword() {
        return password;
    }

    protected String getEmail() {
        return email;
    }

    protected String getCpf() {
        return cpf;
    }

    // Setters
    protected void setUsername(String username) {
        this.username = username;
    }

    protected void setPassword(String password) {
        this.password = password;
    }

    protected void setEmail(String email) {
        this.email = email;
    }

    protected void setCpf(String cpf) {
        this.cpf = cpf;
    }



}

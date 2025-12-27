package itau_bank.data_costumer;
public class User {

    // Attributes
    private String username;
    private String email;
    private String password;
    private String cpf;
    private Account account;

    // Constructor method
    public User(String username, String email, String password, String cpf, Account account) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.cpf = cpf;
        this.account = account;
    }

    // Getters
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getCpf() {
        return cpf;
    }

    public Account getAccount(){
        return this.account;
    }


}

package itau_bank.system.security.login.internal_access.user_data;
public class User {

    // Attributes
    private String username;
    private String email;
    private String password;
    private String CPF;
    private Account account;

    // Constructor method
    public User(String username, String email, String password, String CPF, Account account) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.CPF = CPF;
        this.account = account;
    }


    // Getters
    public Account getAccount(){
        return this.account;
    }

    public String getCPF() {
        return this.CPF;
    }

    public String getPassword() {
        return this.password;
    }

    public String getUsername(){
        return username;
    }


}

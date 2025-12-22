package data_costumer;

public class User {

    // Attributes
    private String username;
    private String password;
    private String cpf;


    // Constructor method
    public User(String username, String password, String cpf) {
        this.username = username;
        this.password = password;
        this.cpf = cpf;
    }

    // Getters and Setters

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getCpf() {
        return cpf;
    }
}

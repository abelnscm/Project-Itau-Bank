package itau_bank.system.security.Login;
import itau_bank.user_data.Database;
import itau_bank.user_data.User;


public class HTTPSession {
    // Attributes
    private User user;
    private Database database;

    // Constructor

    public HTTPSession(User user, Database database) {
        this.user = user;
        this.database = database;
    }

    // Client server

    // O que terá no servidor do cliente?

    // 1. Acesso a sua conta do banco Itaú (Saldo, CPF, nome do titular, depósito, saque, PIX)

}

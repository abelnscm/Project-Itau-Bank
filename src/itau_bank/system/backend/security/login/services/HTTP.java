package itau_bank.system.backend.security.login.services;

import itau_bank.system.backend.security.login.domains.User;

public class HTTP {

    private User user;

    // Constructor
    public HTTP(User user) {
        this.user = user;
    }

    // Session Access
    public static void start(User user) {
        if (user != null) new HTTP(user).access();
    }

    // Client server
    private void access() {
        System.out.printf("Você acessou! %s.", user.getUsername());
    }



}

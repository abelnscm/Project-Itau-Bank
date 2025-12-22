package InternalSytem;

import javax.swing.*;

public class Register extends BancoItau {

   private String userRegister;
   private String passwordRegister;

    public void registerSignUp() {

        userRegister = JOptionPane.showInputDialog("Usuário:");
        if(userRegister.isEmpty()) {
            do {
                JOptionPane.showMessageDialog(null, "Esse campo não pode estar vazio.");
                userRegister = JOptionPane.showInputDialog("Usuário:");

            } while (userRegister.isEmpty());
        }
        passwordRegister = JOptionPane.showInputDialog("Senha:");
        if(passwordRegister.isEmpty()) {
            while (true) {
                JOptionPane.showMessageDialog(null, "Esse campo não pode estar vazio.");
                passwordRegister = JOptionPane.showInputDialog("Senha:");
                if(!passwordRegister.isEmpty()) {
//                    inputClientData();
                    break;
                }

            }

        }
//        inputClientData();
    }



    public Register(){
        super("","","","","");
    }

}

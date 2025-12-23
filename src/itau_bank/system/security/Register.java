package itau_bank.system.security;
import itau_bank.data_costumer.User;
import javax.swing.*;

public class Register extends User {
    public void register() {

        setEmail(JOptionPane.showInputDialog("Insira um e-mail:"));
        if(getEmail().isEmpty()){ // Verifica se o usuário preencheu o campo
            do {
            JOptionPane.showMessageDialog(null, "O campo não pode estar vazio.");
            setEmail(JOptionPane.showInputDialog("Insira um e-mail: "));

            } while (getEmail().isEmpty());
        }

        setUsername(JOptionPane.showInputDialog("Escolha um nome de usuário:"));
        if(getUsername().isEmpty()){ // Verifica se o usuário preencheu o campo
            do {
                JOptionPane.showMessageDialog(null, "O campo não pode estar vazio.");
                setUsername(JOptionPane.showInputDialog("Escolha um nome de usuário:"));

            } while (getUsername().isEmpty());
        }

        setPassword(JOptionPane.showInputDialog("Crie uma senha de 6 dígitos:"));
        if(getPassword().isEmpty()){ // Verifica se o usuário preencheu o campo
            do {
                JOptionPane.showMessageDialog(null, "O campo não pode estar vazio.");
                setPassword(JOptionPane.showInputDialog("Crie uma senha de 6 dígitos:"));

            } while (getPassword().isEmpty());
        }

        String secondPassword = JOptionPane.showInputDialog("Repita sua senha:");
        if(secondPassword.isEmpty()){ // Verifica se o usuário preencheu o campo
            do {
                JOptionPane.showMessageDialog(null, "O campo não pode estar vazio.");
                secondPassword = (JOptionPane.showInputDialog("Repita sua senha de 6 dígitos:"));

            } while (secondPassword.isEmpty());
        }

       if(!secondPassword.equals(getPassword())) { // Verifica se as duas senhas são iguais
           do {
               JOptionPane.showMessageDialog(null, "As senhas precisam ser iguais.");
               secondPassword = (JOptionPane.showInputDialog("Repita sua senha de 6 dígitos:"));

           } while(!secondPassword.equals(getPassword()));
       }

        setCpf(JOptionPane.showInputDialog("Insira seu CPF para finalizar o cadastro:"));

        while (getCpf().isEmpty()) { // Verifica se o CPF está vazio
            JOptionPane.showMessageDialog(null, "O campo não pode estar vazio.");
            setCpf(JOptionPane.showInputDialog("Insira seu CPF para finalizar o cadastro:"));
        }

        while (getCpf().length() != 11) { // Verifica se o CPF tem 11 dígitos
            JOptionPane.showMessageDialog(null, "CPF inválido!");
            setCpf(JOptionPane.showInputDialog("Insira seu CPF para finalizar o cadastro:"));
        }

        JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso.");






    }

}
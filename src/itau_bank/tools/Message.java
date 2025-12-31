package itau_bank.tools;
import javax.swing.*;

public class Message {

    // Specifics methods
    public static String info(String message){
        JOptionPane.showMessageDialog(null, message);
        return message;
    }


}

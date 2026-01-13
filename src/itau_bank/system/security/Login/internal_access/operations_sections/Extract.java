package itau_bank.system.security.login.internal_access.operations_sections;
import itau_bank.system.utils.Message;
import java.util.ArrayList;

public class Extract {
    // Attributes
    private ArrayList<String> history = new ArrayList<String>();

    // Specific methods
    public void add(String register){
        history.add(register);
    }

    public String show(){

        if (history.isEmpty()) {return Message.info("O extrato ainda está vazio.");}

        String result = "EXTRATO BANCÁRIO\n\n";
        for(String extract: history){
         result += extract + "\n";
        }

        return result;
    }

}

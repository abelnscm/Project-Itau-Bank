package itau_bank.system.security.login.internal_acess.operations_sections;
import itau_bank.utils.Message;
import java.util.ArrayList;

public class Extract {
    // Attributes
    private ArrayList<String> history = new ArrayList<String>();

    // Specific methods
    public void add(String register){
        history.add(register);
    }
    public String show(){
        String design = "EXTRATO BANCÁRIO\n";
        String result = "\n ";

        if (history.isEmpty()) {
            return Message.info("O extrato ainda está vazio.");
        }

        for(String extract: history){
         result += extract + "\n";
        }

        return Message.info(design + result);
    }

}

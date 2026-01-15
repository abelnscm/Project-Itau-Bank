package itau_bank.system.security.register;
import itau_bank.system.security.exceptions.register.RegisterException;
import itau_bank.system.utils.FormattedInput;
import itau_bank.system.utils.Message;

public class RegisterUI {

    // Attributes
    private Register register;
    private FormattedInput input;
    private String username;
    private String email;
    private String password;
    private String CPF;
    private String secondPassword;

    // Constructor
    public RegisterUI(Register register, FormattedInput formattedInput) {
        this.register = register;
        this.input = formattedInput;
    }

    // Boot Method
    public void start() {
        while (true) {
            try {
                email = input.required("Digite seu e-mail:");
                username = input.required("Crie um nome de usuário:");
                password = input.requiredPassword("Crie uma senha de 6 dígitos:");
                secondPassword = input.requiredPassword("Repita sua senha:");
                CPF = input.requiredCPF("Digite seu CPF para começar:");

                register.register(username, email, password, CPF, secondPassword);
                Message.info("Cadastro realizado com sucesso!");
                Message.info("Abrindo seção de login...");
                break;

            } catch (RegisterException e) {
                Message.info(e.getMessage());
            }
        }
    }
}

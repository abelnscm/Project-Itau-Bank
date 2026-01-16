package itau_bank.system.app.UI;

import itau_bank.system.UI.components.*;
import itau_bank.system.UI.components.containers.ContainerCPF;
import itau_bank.system.UI.components.containers.ContainerPassword;


public class UICompositionRoot {
    public AppWindow start() {

        ContainerCPF containerCPF = new ContainerCPF();
        ContainerPassword containerPassword = new ContainerPassword();
        LoginPanel loginPanel = new LoginPanel(containerCPF, containerPassword);
        ContentPanel contentPanel = new ContentPanel(loginPanel);

        return new AppWindow(contentPanel);
    }
}

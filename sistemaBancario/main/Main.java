package sistemaBancario.main;

import sistemaBancario.ui.UserInterfaces;
import sistemaBancario.ui.LoopOption;
import sistemaBancario.domain.interfaces.StaticInterfaces;

public class Main {
    public static void main(String[] args) {

        StaticInterfaces.showProgramNameBanner();
        UserInterfaces.showHomeUI();

        LoopOption.loopOption();

        StaticInterfaces.showProgramEndBanner();
    }
}

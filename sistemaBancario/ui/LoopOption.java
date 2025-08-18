package sistemaBancario.ui;

import sistemaBancario.domain.interfaces.StaticInterfaces;
import sistemaBancario.domain.service.AccountManager;

import java.util.Scanner;

public class LoopOption {
    public static void loopOption(){
        Scanner sc = new Scanner(System.in);

        int option = sc.nextInt();
        sc.nextLine();

        do {
            switch (option) {
                case 1:
                    AccountDataInput.inputPersonalData();
                    break;
                case 2:
                    UserInterfaces.showPrintDataUI();
                    AccountManager.printData(sc.nextInt());
                    break;
                default:
                    StaticInterfaces.showInvalidOptionBanner();
                    break;
            }
            UserInterfaces.showHomeUI();
            option = sc.nextByte();
            sc.nextLine();

        }while (option != 9);
    }
}

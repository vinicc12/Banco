package sistemaBancario.domain.interfaces;

public class StaticInterfaces {
    public static void showProgramNameBanner(){
        System.out.println("---------------------------------------------------------");
        System.out.println("                     CONTA BANCÁRIA                      ");
        System.out.println("---------------------------------------------------------");
    }
    public static void showInvalidOptionBanner(){
        System.out.println("---------------------------------------------------------");
        System.out.println("        Opção INVÁLIDA, por favor tente novamente!       ");
        System.out.println("---------------------------------------------------------");
    }
    public static void showProgramEndBanner(){
        System.out.println("---------------------------------------------------------");
        System.out.println("         !!! PROGRAMA BANCÁRIO FINALIZADO !!!");
    }
}

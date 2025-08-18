package sistemaBancario.domain.service.verifiers;

public class CpfVerifier {

    private static boolean verifyAllEquals(int[] cpfArray) {
        for (int i : cpfArray) {
            if (i != cpfArray[0]) {
                return false;
            }
        }
        return true;
    }

    private static boolean isValid(int[] cpfArray, int multiplierIndex) {
        int sum = 0;
        for (int i = 0; i < (multiplierIndex - 1); i++) {
            sum += (multiplierIndex - i) * cpfArray[i];
        }

        int module = sum % 11;
        int expectedVerify;
        if (module < 2) {
            expectedVerify = 0;
        } else {
            expectedVerify = 11 - module;
        }

        return expectedVerify == cpfArray[multiplierIndex - 1];
    }

    private static int[] toIntArray(String cpfString) throws IllegalArgumentException{
        int[] cpfArray = new int[cpfString.length()];
        for (int i = 0; i < cpfString.length(); i++) {
            if (Character.isDigit(cpfString.charAt(i))) {
                cpfArray[i] = cpfString.charAt(i) - '0';
            } else {
                throw new IllegalArgumentException("Contém valores não numéricos!");
            }
        }
        return cpfArray;
    }

    public static boolean cpfVerify(String cpfString) {
        if (cpfString.length() != 11) throw new IllegalArgumentException("Número de dígitos INVÁLIDO!");
        int[] cpfArray = toIntArray(cpfString);
        if (verifyAllEquals(cpfArray)) throw new IllegalArgumentException("Todos os números são iguais!");
        if (!(isValid(cpfArray, 10) && isValid(cpfArray, 11)))
            throw new IllegalArgumentException("Número INVÁLIDO!");
        return true;
    }
}
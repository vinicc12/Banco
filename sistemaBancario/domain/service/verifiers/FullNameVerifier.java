package sistemaBancario.domain.service.verifiers;

import sistemaBancario.domain.util.SentenceFormatting;

import java.util.Scanner;

public class FullNameVerifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            try {
                String nome = sc.nextLine();
                validadeFullName(nome);
                System.out.println(SentenceFormatting.refactoringName(nome));
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }finally {
                System.out.println();
            }
        }
    }







    private static final char[] ALLOWED_LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyzáâãéêíóôõúçÁÂÉÊÍÓÔÚ ".toCharArray();

    public static void validadeFullName(String name) {
        if (name.equals("")) throw new IllegalArgumentException("Nome inválido: O nome não pode ser em branco.");

        String nameWithoutExtraSpaces = SentenceFormatting.removeExtraWhitespaces(name);
        String nameRefactored = SentenceFormatting.capitalizeWords(nameWithoutExtraSpaces);
        String[] arrayName = nameRefactored.split(" ");
        char[] characterArrayName = nameRefactored.toCharArray();

        if (containsInvalidCharacter(characterArrayName)) throw new IllegalArgumentException("Nome inválido: O nome não pode conter carácteres inválidos.");
        if (arrayName.length <= 1) throw new IllegalArgumentException("Nome inválido: O nome não está completo.");
        }

    private static boolean containsInvalidCharacter(char[] charArray) {
        for (char i : charArray) {
            boolean containsInAllowedLetters = false;
            for (char j : ALLOWED_LETTERS) {
                if (i == j) {
                    containsInAllowedLetters = true;
                    break;
                }
            }
            if (!containsInAllowedLetters) return true;
        }
        return false;
    }




}

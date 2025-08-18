package sistemaBancario.domain.util;

public class SentenceFormatting {
    private final static String[] PREPOSITIONS = {"a", "ante", "até", "após", "com", "contra", "de", "desde", "em", "entre", "para",
            "per", "perante", "por", "sem", "sob", "sobre", "trás", "da", "das", "do", "dos",
            "e", "van", "von", "y", "del", "della", "di", "du", "la", "le", "mac", "mc"};

    public static String capitalizeWords(String words){
        String[] wordArray = words.split("\\s+");
        StringBuilder sb = new StringBuilder();

        for (String word : wordArray){
            if (!word.isEmpty() && !isPreposition(word.toLowerCase())){
                sb.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1).toLowerCase());
                sb.append(" ");
            }else if (!word.isEmpty()){
                sb.append(word.toLowerCase());
                sb.append(" ");
            }
        }
        return sb.toString().trim();
    }

     public static String removeExtraWhitespaces(String str){
         return str.trim().replaceAll( "\\s+", " ");
     }

    public static boolean isPreposition(String word){
        for (String preposition : PREPOSITIONS){
            if (word.equals(preposition)){
                return true;
            }
        }
        return false;
    }

    public static String refactoringName(String name){
        return capitalizeWords(removeExtraWhitespaces(name));
    }
}

package nl.novi.jp.methods.senior;

import java.util.Map;
import java.util.HashMap;

/**
 * Lees eerst wat een Map is: https://www.w3schools.com/java/java_hashmap.asp
 * <p>
 * Maak de methode af. Deze moet het Nederlandse woord teruggeven van het Engelse woord.
 * Verzin iets wanneer het Engelse woord niet beschikbaar is.
 */
public class SeniorTwo {

    public static void main(String[] args) {
        Map<String, String> englishDutchWords = new HashMap<>();

        englishDutchWords.put("bottle", "fles");
        englishDutchWords.put("phone", "telefoon");
        englishDutchWords.put("water", "water");
        englishDutchWords.put("bread", "brood");
        englishDutchWords.put("space", "ruimte");
        englishDutchWords.put("flower", "bloem");
        englishDutchWords.put("flour", "bloem");
        englishDutchWords.put("kitchen", "keuken");
        englishDutchWords.put("cup", "");
        englishDutchWords.put("screen", "scherm");

        String translatedWord = translate(englishDutchWords, "cup");
        System.out.println(translatedWord);
    }

    public static String translate(Map<String, String> words, String word) {
        String translatedWord = words.get(word);
        return !translatedWord.isEmpty() ? translatedWord : "-";
    }
}

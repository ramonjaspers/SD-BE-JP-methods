package nl.novi.jp.methods.junior;

import java.util.Locale;

/**
 * Deze klasse is helemaal leeg, je mag nu dus alles zelf doen.
 * Maak een methode die een String ontvangt en deze in HOOFDLETTERS uitprint.
 * Bedenk zelf een goede Engelse naam voor de methode.
 * <p>
 * Hoe maak je hoofdletters van een String in Java?
 * https://duckduckgo.com/?q=java+to+uppercase
 */

public class JuniorFive {
    public static void main(String[] args) {
        upperCasePrint("Dit is een hele mooie sTrgin met GekkE capitalisation");
    }

    public static void upperCasePrint(String string) {
        System.out.println(string.toUpperCase());
    }
}

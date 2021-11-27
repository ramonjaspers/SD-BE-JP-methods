package nl.novi.jp.methods.senior;

import java.util.ArrayList;
import java.util.List;


/**
 * Gegeven: een lijst met namen zonder hoofdletters van klanten.
 * Opdracht: Een luie stagiair heeft alle klanten in het systeem gezet, maar deze kon de Shift-knop niet vinden.
 * Het is aan jou om alle namen van een hoofdletter aan het begin te voorzien. Maak een methode die een List als
 * parameter ontvangt en de inhoud vervolgens van hoofdletters voorziet.
 * <p>
 * Bonus 1: Zorg ervoor dat tussenvoegsels geen hoofdletter krijgen.
 * Bonus 2: Zorg ervoor dat de eerste letter na een '-' wel een hoofdletter krijgt.
 */

public class SeniorOne {
    public static void main(String[] args) {
        List<String> curstomerNames = new ArrayList<>();

        curstomerNames.add("nick piraat");
        curstomerNames.add("michael jackson");
        curstomerNames.add("glennis grace");
        curstomerNames.add("dreetje hazes");
        curstomerNames.add("robbie williams");
        curstomerNames.add("michiel de ruyter");
        curstomerNames.add("sjaak polak");
        curstomerNames.add("jan van jansen");
        curstomerNames.add("henk den hartog");
        curstomerNames.add("mo el-mecky");
        curstomerNames.add("fredje kadetje");


        List<String> capitalizedNames = capitalizeNames(curstomerNames);
        System.out.println(capitalizedNames);
    }

    public static List<String> capitalizeNames(List<String> names) {
        List<String> capitalizedNames = new ArrayList<>();
        ;
        for (String name : names) {
            capitalizedNames.add(capitalizeWord(name));
        }
        return capitalizedNames;
    }

    public static String capitalizeWord(String str) {
        String[] words = str.split("[\\s][-]");
        String capitalizedWord = "";
        for (String w : words) {
            String firstLetter = w.substring(0, 1);
            String restOfWord = w.substring(1);
            capitalizedWord += firstLetter.toUpperCase() + restOfWord + ' ';
        }
        return capitalizedWord;
    }
}

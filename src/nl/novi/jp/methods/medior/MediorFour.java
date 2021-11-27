package nl.novi.jp.methods.medior;

import java.util.ArrayList;
import java.util.List;

/**
 * Uitdagend!
 * Gegeven: Een methode die string per character in een List stopt (numberStringToArrayList).
 * Gegeven: Een methode die een getal ontvangt en deze vertaalt naar een String (numberListToStringList).
 * Gegeven: Twee methodes die afgemaakt moeten worden door jou!
 * <p>
 * Deze applicatie heeft als doel om een string van nummer in zijn geheel uit te schrijven:
 * "123" wordt "one-two-three"
 * <p>
 * Twee methodes zijn al gegeven, twee moet je zelf maken en je dient ze vervolgens in de juiste volgorde aan te roepen
 * vanuit de main-methode.
 * Pas numberListToStringList() zo aan dat de getallen uit de list worden omgezet naar text en worden toegevoegd aan:
 * wordNumbers
 * <p>
 * Pas printNumbers() zo aan dat de List wordt geprint met een "-" tussen de Strings.
 */

public class MediorFour {

    public static void main(String[] args) {

        List<Integer> integers = numberStringToArrayList("123123145");
        List<String> words = numberListToStringList(integers);
        printNumbers(words);
    }

    public static List<Integer> numberStringToArrayList(String numbers) {
        List<Integer> numberList = new ArrayList<>();

        for (char character : numbers.toCharArray()) {
            numberList.add(Integer.parseInt(String.valueOf(character)));
        }
        return numberList;
    }

    //TODO: Maak deze methode af.
    public static List<String> numberListToStringList(List<Integer> numbers) {
        List<String> wordNumbers = new ArrayList<>();
        for (int n : numbers) {
            wordNumbers.add(numberToWord(n));
        }
        return wordNumbers;
    }

    public static String numberToWord(int number) {
        return switch (number) {
            case 0 -> "zero";
            case 1 -> "one";
            case 2 -> "two";
            case 3 -> "three";
            case 4 -> "four";
            case 5 -> "five";
            case 6 -> "six";
            case 7 -> "seven";
            case 8 -> "eight";
            case 9 -> "nine";
            default -> "Unknown number";
        };
    }

    public static void printNumbers(List<String> numbers) {
        String numberString = "";
        for (String n : numbers) {
            numberString = numberString.length() > 0 ? numberString + '-' + n : n;
        }
        System.out.println(numberString);
    }
}

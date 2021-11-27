package nl.novi.jp.methods.junior;

/**
 * Deze klasse bevat al de methode negativeNumberChecker. Beantwoord voor jezelf wat deze methode doet.
 * <p>
 * Roep de methode een paar keer aan om zijn gedrag in de praktijk te zien.
 */

public class JuniorThree {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        negativeNumberChecker(numbers);
    }

    public static void negativeNumberChecker(int[] numbers) {
        for (int number : numbers) {
            if (number > 0) {
                System.out.println(number + " is een positief getal.");
            } else {
                System.out.println(number + " is een negatief getal.");
            }
        }
    }
}

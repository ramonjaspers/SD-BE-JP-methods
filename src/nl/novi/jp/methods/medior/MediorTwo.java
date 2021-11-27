package nl.novi.jp.methods.medior;

/**
 * Gegeven: Een methode die true of false (boolean) teruggeeft op basis van de gegeven leeftijd.
 * <p>
 * Roep deze methode (is oldEnough) vanuit de main-methode aan. Op basis van de return value, roep je
 * of printUnderAgeWarning() of printProceed() uit.
 */
public class MediorTwo {

    public static void main(String[] args) {
        int age = 19;
        System.out.println(age);
        if (isOldEnough(age)) {
            printProceed();
        } else {
            printUnderAgeWarning();
        }
    }

    public static boolean isOldEnough(int age) {
        return age > 17;
    }

    public static void printUnderAgeWarning() {
        System.out.println("You are not old enough for this activity!");
    }

    public static void printProceed() {
        System.out.println("No warning!");
    }
}

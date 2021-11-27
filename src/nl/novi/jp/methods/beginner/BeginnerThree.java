package nl.novi.jp.methods.beginner;

/**
 * Onderstaande code is uitgecommentarieerd, omdat deze niet compileert. Er zit dus een fout in. Deze ga jij oplossen.
 * <p>
 * Haal de comments eerst weg.
 * <p>
 * Dit is de foutmelding: Cannot resolve method 'driveRight' in 'BeginnerThree'. Deze foutmelding betekent dat in de
 * klasse BeginnerThree de methode met de naam driveRight wordt aangeroepen, maar dat deze niet bestaat.
 * <p>
 * Voeg deze methode toe en zorgt dat deze de tekst "The car turns right" uitprint.
 */
public class BeginnerThree {

    public static void main(String[] args) {
        driveLeft();
        driveRight();
    }

    public static void driveLeft() {
        System.out.println("The car turns left");
    }

    public static void driveRight() {
        System.out.println("The car turns right");
    }
}

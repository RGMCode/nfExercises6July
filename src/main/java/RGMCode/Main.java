package RGMCode;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*returnName();
        System.out.println("------------------------");
        name5Times();
        System.out.println("------------------------");
        scannerMethode();
        System.out.println("------------------------");

         */
        arrZahlenwoerter();

    }

    /* ***********************************Novice*********************************** */

    // Novice - Aufgabe 1
    // Schreibe ein Programm das deinen Namen ausgibt.
    public static void returnName() {
        String personName = "René";
        System.out.println(personName);

    }

    // Novice - Aufhabe 2
    // Lass den Namen mit Hilfe einer Schleife 5 mal ausgeben.
    public static void name5Times() {
        for (int i = 0; i < 5; i++) {
            System.out.println("René");
        }

    }

    // Novice - Aufgabe 3
    // Schreibe eine Methode die prüft ob eine Zahl größer als 0 ist.
    public static boolean proofNumber(int checkNumber) {
        if (checkNumber > 0) {
            return true;
        } else {
            return false;
        }
    }

    // Novice - Aufgabe 4
    // Schreibe ein Programm, das den Namen des Nutzers einliest (Scanner)
    // und ihn mit Namen begrüßt.
    public static void scannerMethode() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hey DU da wie lautet dein Name?");
        String persName = scan.nextLine();
        System.out.println("Hallo " + persName);

    }

        /* ***********************************Intermediate*********************************** */

    // Intermediate - Aufgabe 1
    // Fülle ein String-Array mit den Zahlenwörtern "Eins" bis "Zehn"
    public static void arrZahlenwoerter() {
        String[] arr = {"Eins", "Zwei", "Drei", "Vier", "Fünf", "Sechs", "Sieben", "Acht", "Neun", "Zehn",};
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        System.out.println(arr[5]);
        System.out.println(arr[6]);
        System.out.println(arr[7]);
        System.out.println(arr[8]);
        System.out.println(arr[9]);
    }


    // Intermediate - Aufgabe 2
    // Schreibe eine Methode die zu einer einstelligen Zahl das
    // entsprechende Zahlenwort ausgibt.


    // Intermediate - Aufgabe 3
    // Schreibe ein Programm das die Zahlen 1-100 ausgibt, aber:
    // -Vor Zahlen die durch 3 teilbar sind (modulo) soll ein # stehen
    // -Vor Zahlen die durch 5 teilbar sind soll ein $ stehen


    // Intermediate - Aufgabe 4
    // Schreibe ein Programm die Wörter vom Benutzer einliest (Scanner)
    // und diese in einem Array speichert.
    // -Gib vor jeder Eingabe jeweils die eingegebenen Wörter noch mal aus.



    /* ***********************************EXPERT*********************************** */

    // Expert - Aufgabe 1
    // Schreibe eine Methode die einen Eingabestring rückwärts ausgibt.


    // Expert - Aufgabe 2
    // Gibt den folgenden Array aufsteigend sortiert aus: {6, 2, 8, 3, 9, 6}


    // Expert - Aufgabe 3
    // Schreibe eine Methode die einen String nach , separiert und als Array zurück gibt.


    // Expert - Aufgabe 4
    // Schreibe eine Methode die Quersumme einer Ganzzahl berechnet.


    // Expert - Aufgabe 5
    // Gib eine Ganzzahl (1-100) als römische Zahl aus (12 = XII)


}
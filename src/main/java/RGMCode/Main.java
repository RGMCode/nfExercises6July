package RGMCode;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //returnName();
        //name5Times();
        //scannerMethode();
        //arrZahlenwoerter();
        //moduloString();
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
        String[] arr = {"Eins", "Zwei", "Drei",
                "Vier", "Fünf", "Sechs",
                "Sieben", "Acht", "Neun", "Zehn",};

        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }

    }

    // Intermediate - Aufgabe 2
    // Schreibe eine Methode die zu einer einstelligen Zahl das
    // entsprechende Zahlenwort ausgibt.
    public static String numberToString(int num) {
        switch (num) {
            case 1:
                return "Eins";
            case 2:
                return "Zwei";
            case 3:
                return "Drei";
            case 4:
                return "Vier";
            case 5:
                return "Fünf";
            case 6:
                return "Sechs";
            case 7:
                return "Sieben";
            case 8:
                return "Acht";
            case 9:
                return "Neun";
            case 10:
                return "Zehn";
            default:
                return "weiter geht es nicht";
        }

    }

    // Intermediate - Aufgabe 3
    // Schreibe ein Programm das die Zahlen 1-100 ausgibt, aber:
    // -Vor Zahlen die durch 3 teilbar sind (modulo) soll ein # stehen
    // -Vor Zahlen die durch 5 teilbar sind soll ein $ stehen
    // Zusatz
    // -Vor Zahlen die durch 3 und 5 Teilbar sind soll ein #$ stehen

    public static void moduloString() {
        int modNum = 100;
        for (int i = 0; i < modNum; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("#$" + i);
            } else if (i % 3 == 0) {
                System.out.println("#" + i);
            } else if (i % 5 == 0) {
                System.out.println("$" + i);
            } else {
                System.out.println(i);
            }
        }

    }


    // Intermediate - Aufgabe 4
    // Schreibe ein Programm die Wörter vom Benutzer einliest (Scanner)
    // und diese in einem Array speichert.
    // -Gib vor jeder Eingabe jeweils die eingegebenen Wörter noch mal aus.




    /* ***********************************EXPERT*********************************** */

    // Expert - Aufgabe 1
    // Schreibe eine Methode die einen Eingabestring rückwärts ausgibt.
    public static String backString(String conString) {
        //String abc = "abcde";
        String cba = new StringBuffer(conString).reverse().toString();
        System.out.println(cba);
        return cba;
    }


    // Expert - Aufgabe 2
    // Gibt den folgenden Array aufsteigend sortiert aus: {6, 2, 8, 3, 9, 6}
    public static int[] ascNum(int[] checkArrNum) {
        int[] arrNum = checkArrNum;
        Arrays.sort(arrNum);
        //System.out.println(Arrays.toString(arrNum));
        return arrNum;
    }


    // Expert - Aufgabe 3
    // Schreibe eine Methode die einen String nach , separiert und als Array zurück gibt.
    public static String stringSplit(String strToSplit) {
        String strSplit = "Ich mag Java gern";
        String resStrSplit = strSplit.replaceAll("\\s", "");
        //System.out.println(resStrSplit);
        return resStrSplit;
    }


    // Expert - Aufgabe 4
    // Schreibe eine Methode die Quersumme einer Ganzzahl berechnet.


    // Expert - Aufgabe 5
    // Gib eine Ganzzahl (1-100) als römische Zahl aus (12 = XII)


}
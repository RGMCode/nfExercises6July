package RGMCode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    /* ********************Novice******************** */
    // Novice - Aufgabe 3 - Test
    @Test
    void proofNumberWithBoolean1() {
        //given
        int proofNum = 1;
        //when
        boolean pNum = Main.proofNumber(proofNum);
        //then
        assertTrue(pNum);
    }



    /* ********************Intermediate******************** */

    // Intermediate - Aufgabe 2 - Test
    @Test
    void numberToStringTest1(){
        //given
        int num = 1;
        //when
        String actual = Main.numberToString(num);
        //then
        assertEquals("Eins", actual);
    }
    @Test
    void numberToStringTest2(){
        //given
        int num = 2;
        //when
        String actual = Main.numberToString(num);
        //then
        assertEquals("Zwei", actual);
    }
    @Test
    void numberToStringTest3(){
        //given
        int num = 3;
        //when
        String actual = Main.numberToString(num);
        //then
        assertEquals("Drei", actual);
    }
    @Test
    void numberToStringTest4(){
        //given
        int num = 4;
        //when
        String actual = Main.numberToString(num);
        //then
        assertEquals("Vier", actual);
    }
    @Test
    void numberToStringTest5(){
        //given
        int num = 5;
        //when
        String actual = Main.numberToString(num);
        //then
        assertEquals("Fünf", actual);
    }
    @Test
    void numberToStringTest6() {
        //given
        int num = 6;
        //when
        String actual = Main.numberToString(num);
        //then
        assertEquals("Sechs", actual);
    }
    @Test
    void numberToStringTest7() {
        //given
        int num = 7;
        //when
        String actual = Main.numberToString(num);
        //then
        assertEquals("Sieben", actual);
    }
    @Test
    void numberToStringTest8() {
        //given
        int num = 8;
        //when
        String actual = Main.numberToString(num);
        //then
        assertEquals("Acht", actual);
    }
    @Test
    void numberToStringTest9() {
        //given
        int num = 9;
        //when
        String actual = Main.numberToString(num);
        //then
        assertEquals("Neun", actual);
    }
    @Test
    void numberToStringTest10() {
        //given
        int num = 10;
        //when
        String actual = Main.numberToString(num);
        //then
        assertEquals("Zehn", actual);
    }


    /* **********************Expert********************** */

    // Expert - Aufgabe 1
    // Schreibe eine Methode die einen Eingabestring rückwärts ausgibt.
    @Test
    void reverseStringTest(){
        //given
        String conString = "abcdefg";
        //when
        String actual = Main.backString(conString);
        String resString = "gfedcba";
        //then
        assertEquals(resString,actual);
    }



    // Expert - Aufgabe 2
    // Gibt den folgenden Array aufsteigend sortiert aus: {6, 2, 8, 3, 9, 6}
    @Test
    void ascNumTest(){
        //given
        int[] checkArrNum = {6, 2, 8, 3, 9, 6};
        //when
        int[] resAscNum = {2, 3, 6, 6, 8, 9};
        int[] act = Main.ascNum(checkArrNum);
        //then
        assertArrayEquals(resAscNum, act);
    }



    // Expert - Aufgabe 3
    // Schreibe eine Methode die einen String nach , separiert und als Array zurück gibt.
    @Test
    void stringSplitTest(){
        //given
        String strToSplit = "Ich mag Java gern";
        //when
        String resStrToSplit = "IchmagJavagern";
        String act = Main.stringSplit(strToSplit);
        //then
        assertEquals(resStrToSplit, act);
    }
}
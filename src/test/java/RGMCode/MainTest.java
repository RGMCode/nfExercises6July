package RGMCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    /* ********************Novice******************** */
    // Novice - Aufgabe 3 - Test
    @Test
    void proofNumberWithBoolean() {
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
    void numberToStringTest(){
        //given
        int num = 1;
        //when
        String actual = Main.numberToString(num);
        //then
        assertEquals("Eins", actual);
    }


}
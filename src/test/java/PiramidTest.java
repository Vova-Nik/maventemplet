import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PiramidTest {

    @Test
    void calculatePass() {
        Piramid pira = new Piramid();
        int calc = pira.calculatePass();
        System.out.println(calc);
        assertEquals(23,calc);
    }
    @Test
    void calculatePass1() {
        Piramid pira = new Piramid(" ");
        int calc = pira.calculatePass();
        System.out.println(calc);
        assertEquals(25,calc);
    }

}
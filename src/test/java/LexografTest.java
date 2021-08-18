import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LexografTest {

    @Test
    void find() {
    }

    @Test
    void shift() {
    }

    @Test
    void check() {
       boolean a = Lexograf.checkTest("1234567890");
       assertTrue(a);
         a = Lexograf.checkTest("9999999999");
        assertFalse(a);
         a = Lexograf.checkTest("0034567899");
        assertFalse(a);
        a = Lexograf.checkTest("0123456780");
        assertFalse(a);
    }

    @Test
    void toArm() {
        System.out.println(Lexograf.toArm(1200));
        char[] c = Lexograf.toArm(1200);
        System.out.println(c);
        c = Lexograf.toArm(1234567890);
        System.out.println(c);
    }

    @Test
    void builder() {
        Lexograf.builder(100);
//        int[][] rez = Lexograf.getRez();
        List<String> ls = Lexograf.getRezList(25);
        System.out.println(ls);
    }

    @Test
    void toArr() {
//        System.out.println(Lexograf.toArr(1200));
        char[] t = {'1','2','0','0'};
        char[] c = Lexograf.toArr(1200);
        System.out.println(c);
    }
}


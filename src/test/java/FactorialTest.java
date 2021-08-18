import org.junit.jupiter.api.Test;
import org.w3c.dom.ls.LSOutput;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    void getFactorial() {
        Factorial factorial = new Factorial();
        int inp = 0;
        double rez = factorial.getFactorial(inp);
        System.out.println(inp + "! = " + rez);
        assertEquals(1, rez);

        inp = 1;
        rez = factorial.getFactorial(inp);
        System.out.println(inp + "! = " + rez);
        assertEquals(1, rez);

        inp = 2;
        rez = factorial.getFactorial(inp);
        System.out.println(inp + "! = " + rez);
        assertEquals(2, rez);

        inp = 3;
        rez = factorial.getFactorial(inp);
        System.out.println(inp + "! = " + rez);
        assertEquals(6, rez);

        inp = 10;
        rez = factorial.getFactorial(inp);
        System.out.println(inp + "! = " + rez);
        assertEquals(3628800, rez);

        inp = 100;
        rez = factorial.getFactorial(inp);
        System.out.println(inp + "! = " + rez);

        int sum = factorial.sumOfDigits(rez);
        System.out.println("sum " + sum);
        assertEquals(68,sum);
    }
}
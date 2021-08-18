import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FibonachiTest {

    @Test
    void fibo(){
        Fibonachi fibonachi = new Fibonachi();
        double[] result = fibonachi.calculate(10);
        double[] templet = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34 };
        Arrays.stream(result).forEach(System.out::println);
        assertArrayEquals(templet, result);

   }

    @Test
    void fibo0(){
        Fibonachi fibonachi = new Fibonachi();
        double[] result = fibonachi.calculate(0);
        Arrays.stream(result).forEach(System.out::println);
        assertEquals(0, result.length);

    }

    @Test
    void fibo1(){
        Fibonachi fibonachi = new Fibonachi();
        double[] result = fibonachi.calculate(1);
        Arrays.stream(result).forEach(System.out::println);
        double[] templet = {0};
        assertArrayEquals(templet, result);
    }
    @Test
    void fibo2(){
        Fibonachi fibonachi = new Fibonachi();
        double[] result = fibonachi.calculate(2);
        Arrays.stream(result).forEach(System.out::println);
        double[] templet = {0,1};
        assertArrayEquals(templet, result);
    }

    @Test
    void fibo3(){
        Fibonachi fibonachi = new Fibonachi();
        double[] result = fibonachi.calculate(3);
        Arrays.stream(result).forEach(System.out::println);
        double[] templet = {0,1,1};
        assertArrayEquals(templet, result);
    }
    @Test
    void fibo_negative(){
        Fibonachi fibonachi = new Fibonachi();
        double[] result = fibonachi.calculate(-1);
        Arrays.stream(result).forEach(System.out::println);
        assertEquals(0, result.length);
    }


}
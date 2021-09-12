import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class NoSpoonTest {


    @Test
    void calculate() {
        char[][] matrix = {
                {'0', '0', '0'},
                {'.', '0', '.'},
                {'.', '0', '.'}
        };
        NoSpoon noSpoon = new NoSpoon(matrix);
        String[][] ret = noSpoon.calculate();
        System.out.println("Okkkkkkkkkkk");
    }

    @Test
    void debInfo() {
        Object str;
        Map<Integer, String> mapa = new HashMap<>();
        mapa.put(1,"first");
        mapa.put(2,"second");
        mapa.put(3,"third");
        str = "Hellow, Vova";
        System.out.println(str);
        str = mapa;
        System.out.println(str);

    }
}
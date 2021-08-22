import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CesarCodeTest {

    @Test
    void prepare1() {
        CesarCode cc = new CesarCode();
        String str = cc.prepare1("text");
        System.out.println(str);
    }

    @Test
    void prepare2() {
        CesarCode cc = new CesarCode();
        String str = cc.prepare2("abc");
        System.out.println(str);
         str = cc.prepare2("abc sfgdfshgfk & dgsdg12 56i9 fdhgfjg");
        System.out.println(str);
    }

    @Test
    void prepare3() {
        CesarCode cc = new CesarCode();
        String str = cc.prepare3("abc today is sunday");
        System.out.println(str);

    }

    @Test
    void prepare4() {
        CesarCode cc = new CesarCode();
        List<String> str = cc.prepare4("abc,today!is sunday.But I`m working");
        str.forEach(System.out::println);

    }

    @Test
    void get26() {
        CesarCode cc = new CesarCode();
        for (int i = 0; i < 100; i++) {
            System.out.println(cc.get26());
        }

    }
}
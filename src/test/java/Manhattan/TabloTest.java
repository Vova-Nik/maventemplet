package Manhattan;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TabloTest {

    //                  0         1         2         3         4         5         6         7         8         8         1
    //                  01234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456
    static String s0 = " 1  ##   ## ##  ### ###  ## # # ###  ## # # #   # # ###  #  ##   #  ##   ## ### # # # # # # # # # # ### ###";
    static String s1 = "2 3 # # #   # # #   #   #   # #  #    # # # #   ### # # # # # # # # # # #    #  # # # # # # # # # #   #   #";
    static String s2 = "456 ##  #   # # ##  ##  # # ###  #    # ##  #   ### # # # # ##  # # ##   #   #  # # # # ###  #   #   #   ##";
    static String s3 = "7 8 # # #   # # #   #   # # # #  #  # # # # #   # # # # # # #    ## # #   #  #  # # # # ### # #  #  #      ";
    static String s4 = "9 0 ##   ## ##  ### #    ## # # ###  #  # # ### # # # #  #  #     # # # ##   #  ###  #  # # # #  #  ###  # ";
    static String grids = s0+s1+s2+s3+s4;
    static Tablo tablo;

    @BeforeAll
    static  void init(){
        tablo = new Tablo(4,5,grids);
        System.out.println(tablo.getMatrix());
    }

    @Test
    void recode1() {
        String res = tablo.recode("A");
        System.out.println(res);
        show1(res);
    }

    @Test
    void recode2() {
        String res = tablo.recode("AB");
        System.out.println(res);
        show2(res);
    }

    void show1(String response){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 20; i++) {
            if(i%4 == 0 && i!=0)sb.append('\n');
            sb.append(response.charAt(i));
        }
        System.out.println(sb.toString());
    }

    void show2(String response){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 40; i++) {
            if(i%8 == 0 && i!=0)sb.append('\n');
            sb.append(response.charAt(i));
        }
        System.out.println(sb.toString());
    }
}
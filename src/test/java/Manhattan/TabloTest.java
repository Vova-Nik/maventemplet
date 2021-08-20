package Manhattan;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TabloTest {

    //                    0         1         2         3         4         5         6         7         8         8         1
    //                    01234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456
//    static String s0 = "a1b ##   ## ##  ### ###  ## # # ###  ## # # #   # # ###  #  ##   #  ##   ## ### # # # # # # # # # # ### ### ";0
//    static String s1 = "2c3 # # #   # # #   #   #   # #  #    # # # #   ### # # # # # # # # # # #    #  # # # # # # # # # #   #   # ";108
//    static String s2 = "456 ##  #   # # ##  ##  # # ###  #    # ##  #   ### # # # # ##  # # ##   #   #  # # # # ###  #   #   #   ## ";216
//    static String s3 = "7d8 # # #   # # #   #   # # # #  #  # # # # #   # # # # # # #    ## # #   #  #  # # # # ### # #  #  #       ";324
//    static String s4 = "9e0 ##   ## ##  ### #    ## # # ###  #  # # ### # # # #  #  #     # # # ##   #  ###  #  # # # #  #  ###  #  ";432
//                                                                                                                                  539 540

    static String s0 = " #  ##   ## ##  ### ###  ## # # ###  ## # # #   # # ###  #  ##   #  ##   ## ### # # # # # # # # # # ### ### ";
    static String s1 = "# # # # #   # # #   #   #   # #  #    # # # #   ### # # # # # # # # # # #    #  # # # # # # # # # #   #   # ";
    static String s2 = "### ##  #   # # ##  ##  # # ###  #    # ##  #   ### # # # # ##  # # ##   #   #  # # # # ###  #   #   #   ## ";
    static String s3 = "# # # # #   # # #   #   # # # #  #  # # # # #   # # # # # # #    ## # #   #  #  # # # # ### # #  #  #       ";
    static String s4 = "# # ##   ## ##  ### #    ## # # ###  #  # # ### # # # #  #  #     # # # ##   #  ###  #  # # # #  #  ###  #  ";
    static String grids = s0 + s1 + s2 + s3 + s4;
    static Tablo tablo;

    @BeforeAll
    static void init() {
        tablo = new Tablo(4, 5, grids);
//        System.out.println(tablo.getMatrix());
    }

    @Test
    void recode1() {
        String[] res;
//        res = tablo.recode("e");
//        System.out.println(res);
//        show10(res);

         res = tablo.recode("e");
        show10(res);
        res = tablo.recode("manhattan");
        show10(res);
//        res = tablo.recode("E");
//        System.out.println(res);
//        show1(res);
//        res = tablo.recode("*");
//        System.out.println(res);
//        show1(res);

    }

    void show10(String[] answer){
        for (String s : answer) {
            System.out.println(s);
        }
    }

}

//###  #  # ## # ###
//### #   ##  #   ###
import Manhattan.Combiner;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CombinerTest {
    static String s0 = " #  ##   ## ##  ### ###  ## # # ###  ## # # #   # # ###  #  ##   #  ##   ## ### # # # # # # # # # # ### ###";
    static String s1 = "# # # # #   # # #   #   #   # #  #    # # # #   ### # # # # # # # # # # #    #  # # # # # # # # # #   #   #";
    static String s2 = "### ##  #   # # ##  ##  # # ###  #    # ##  #   ### # # # # ##  # # ##   #   #  # # # # ###  #   #   #   ##";
    static String s3 = "# # # # #   # # #   #   # # # #  #  # # # # #   # # # # # # #    ## # #   #  #  # # # # ### # #  #  #      ";
    static String s4 = "# # ##   ## ##  ### #    ## # # ###  #  # # ### # # # #  #  #     # # # ##   #  ###  #  # # # #  #  ###  # ";
    static Combiner cb;

    @BeforeAll
    static void init() {
        cb = new Combiner(4, 5, s0 + s1 + s2 + s3 + s4);
    }

    @Test
    void tttTest() {

        String vv = ttt();
        System.out.println(vv);
    }

    public String ttt() {
        String tt = "MANHATTAN ()*&^";
        String tmpl = "ABCDEFGHIJKLMNOPQRSTUVWXYZ?";

        String tr = tt.chars()
                .mapToObj(e -> (char) e)
                .map(Object::toString)
                .peek(System.out::println)
                .map(e -> {
                    if (!tmpl.contains(e)) return "?";
                    return e;
                })
                .collect(Collectors.joining());

        return tr;

    }

}
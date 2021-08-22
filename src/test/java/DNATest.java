import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DNATest {
    static DNA dna;
    @BeforeAll
    static void init(){
        dna = new DNA();
    }

    @Test
    void DNA1() {
        String inp =  "AACCTTGG";
        String r =  dna.DNA1(inp);
        System.out.println(inp);
        System.out.println(r);
    }

    @Test
    void DNA2() {
        String inp =  "AACCTTGG";
        String r =  dna.DNA2(inp);
        System.out.println(inp);
        System.out.println(r);
    }

    @Test
    void DNA3() {
        String inp =  "AACCTTGG";
       String r =  dna.DNA3(inp);
        System.out.println(inp);
        System.out.println(r);
    }

    @Test
    void DNA4() {
        String inp =  "AACCTTGG";
        String r =  dna.DNA4(inp);
        System.out.println(inp);
        System.out.println(r);
    }

    @Test
    void DNA5() {
        String inp =  "AACCTTGG";
        String r =  dna.DNA4(inp);
        System.out.println(inp);
        System.out.println(r);

        char[] chh = "ABCdef".toCharArray();
        
    }
}
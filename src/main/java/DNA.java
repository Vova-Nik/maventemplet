import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DNA {

    public String DNA1(String s) {
        char[] ii = s.toCharArray();
        char[] out = new char[ii.length];
        for (int i = 0; i < out.length; i++) {
            if (ii[i] == 'A') out[i] = 'T';
            if (ii[i] == 'T') out[i] = 'A';
            if (ii[i] == 'C') out[i] = 'G';
            if (ii[i] == 'G') out[i] = 'C';
        }
        return String.valueOf(out);
    }

    public String DNA2(String s) {
        String ss = s.chars()
                .mapToObj(Character::toString)
                .map(c -> {
                    if (c.equals("A")) return "T";
                    if (c.equals("T")) return "A";
                    if (c.equals("C")) return "G";
                    if (c.equals("G")) return "A";
                    return c;
                })
                .collect(Collectors.joining());
        return ss;
    }

    public String DNA3(String s) {
        StringBuilder sb = new StringBuilder();
        Stream<Character> cs = s.chars()
                .mapToObj(c -> (char) c);
        Stream<Character> ccs = cs.map(c -> {
            if (c == 'A') return 'T';
            if (c == 'T') return 'A';
            if (c == 'C') return 'G';
            if (c == 'G') return 'C';
            return c;
        });
        ccs.forEach(sb::append);
        return sb.toString();
    }

    public String DNA4(String s) {
        final Map<Character, Character> mapa = new HashMap<>();
        mapa.put('A', 'T');
        mapa.put('T', 'A');
        mapa.put('C', 'G');
        mapa.put('G', 'C');

        StringBuilder sb = new StringBuilder();
        s.chars()
                .mapToObj(c -> (char) c)
                .map(mapa::get)
                .forEach(sb::append);
        return sb.toString();
    }

}

package Manhattan;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Combiner {

    List<Letter> list;
    String tmpl = "ABCDEFGHIJKLMNOPQRSTUVWXYZ?";
    int L;
    int H;
    String[] tmplStrs = new String[H];

    public Combiner(int L, int H, String row) {
        this.L = L;
        this.H = H;
        char[] chtmpl = tmpl.toCharArray();
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < 27*L; j++) {

            }
        }
    }

    public char[][] getLetter(char ch) {
        int pos = tmpl.indexOf(ch);
        Letter letter = list.get(pos);
        return letter.getLetter();
    }

    public String build(String inp) {
        StringBuilder[] sbs = new StringBuilder[H];
        for (int i = 0; i < H; i++) {
            sbs[i] = new StringBuilder();
        }
        char[] tchars = inp.toCharArray();
        for (char c : tchars) {
            addLetter(sbs, c);
        }
        return sbs.toString();

    }

    StringBuilder[] addLetter(StringBuilder[] sbs, char letter) {
        char[][] chl = getLetter(letter);
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < L; j++) {
                sbs[i].append(chl[i][j]);
            }
            sbs[i].append("\n");
        }
        return null;

    }

    StringBuilder[] endBuild(StringBuilder[] sbs) {
        for (int i = 0; i < H; i++) {
            sbs[i].append("\n");
        }
        return sbs;
    }

    public String  recode(){
        String tt = "Manhattan";
        String tmpl = "ABCDEFGHIJKLMNOPQRSTUVWXYZ?";

        String tr = Stream.of(tt)
                .peek(System.out::println)
                .map(e->{
                    if(!tmpl.contains(e)) return "?";
                    return e;
                })
                .collect(Collectors.joining());
        return tr;
    }

}


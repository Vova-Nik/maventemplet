import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CesarCode {
    String text = "tttttt";
    int ctr = 0;

    public String prepare1(String text) {
        Stream<Character> chs = text.chars()
                .mapToObj(c -> (char) c);
        String s = chs
                .collect(Collector.of(
                        StringBuilder::new,
                        StringBuilder::append,
                        StringBuilder::append,
                        StringBuilder::toString));
        return s;
    }

    public String prepare2(String text) {
        final IntWrapper wrapper = new IntWrapper();

        Stream<Integer> str = text.chars()
                .boxed();

        String s = str
                .map(c -> {
                    if (Character.isLetter(c))
                        return wrapper.getNext(c);
                    return c;
                })
                .map(Character::toString)
                .collect(Collectors.joining());

        return s;
    }

    public String prepare3(String text) {
        final StringBuilder sb = new StringBuilder();
        IntStream is = text.chars();
        Stream<Character> cs = is.mapToObj(c -> (char) c);
        Stream<String> ss = cs.map(Object::toString);
//        String string = ss.reduce("", (part,el)->part + el);
        String string = ss.collect(Collectors.joining("|--|"));

        return string;
    }

    public List<String> prepare4(String text) {

        Stream<String> ss = Stream.of(text.split("\\b"))
                .filter(c -> (!c.equals(" ") && !c.equals(".") && !c.equals("!") && !c.equals(",")));
        List<String> ls = ss.collect(Collectors.toList());
        return ls;
    }

    public String get26() {

        return "ctr = " + ++ctr + " , " + "res = " + ++ctr % 26;
    }



}

class IntWrapper {
    public int value = 1;
    int tmp = 0;
    final int SHIFT = 0x61;

    public IntWrapper() {
    }

    public IntWrapper(int value) {
        this.value = value;
    }

    public int getNext(int c) {
        tmp = value;
        value++;
        if (value == 26)
            value = 0;
        c = code(c);
        c = (c + tmp) % 26;
        c = decode(c);
        return c;
    }

    int code(int c) {
        return c - SHIFT;
    }

    int decode(int c) {
        return c + SHIFT;
    }

}

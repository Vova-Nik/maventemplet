import org.w3c.dom.ls.LSOutput;

import java.util.stream.Stream;

public class StreamApi {

    public void streamOf() {
        System.out.println("Hi vovchik");
         Stream.of("dd2", "aa2", "bb1", "bb3", "cc4")
                 .map(s->{
                     System.out.println("map " +s);
                     return s.toUpperCase();
                 })
                .filter(s -> {
                    System.out.println("Filter " + s);
                    return true;
                })
                .forEach(s-> System.out.println("foreach " +s));
    }

    public void streamOfch() {
        String str = new String("Hi Vovchik!");
        str.chars()
                .map(s->{
                    System.out.println("map " +s);
//                    char sch = Character.forDigit(s,10);
                    return Character.toUpperCase(s);
                })
                .peek(s-> System.out.println("upercased " + s))
                .filter(s -> {
                    System.out.println("Filter " + s);
                    return true;
                })
                .forEach(s-> System.out.println("foreach " +(char)s));
    }

    void sortier(){
        Stream.of("dd2", "aa2", "bb1", "bb3", "cc4")
//                .sorted((s1,s2)->{
//                    System.out.printf("sort: %s;%s\n", s1,s2);
//                    return s1.compareTo(s2);
//                })
                .sorted()
                .forEach(s-> System.out.println("foreach " + s));
    }

    public static void main(String[] args) {
        StreamApi sa = new StreamApi();
        sa.sortier();
    }
}


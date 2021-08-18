import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//https://projecteuler.net/problem=22

public class NamesScores {
    String filename;    // = "p022_names.txt";
    Set<String> names;
    String file;

    public NamesScores(String filename) throws IOException {
        this.filename = filename;
        Path fileName = Path.of(filename);
        names = new TreeSet<>();
        file = Files.readString(fileName);

        String str = file.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> c != '"')
                .map(String::valueOf)
                .collect(Collectors.joining());

        Arrays.asList(str.split(",")).forEach(n -> names.add(n));
    }

    public Set<String> getNamesSet() {
        return names;
    }

    public Map<String, Integer> calculate() {
        Map<String, Integer> mapa = new HashMap<>();
        int counter = 0;
        for (String name : names) {
            counter++;
            if(name.equals("COLIN")){
                System.out.println("COLIN");
            }
            int part = name.chars().reduce(0,(a,b)->a+b-64);
            int score = part*counter;
            mapa.put(name, score);

        }
        return mapa;
    }
}

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class NamesScoresTest {

    @Test
    void readFile() throws IOException {
        NamesScores namesScores = new NamesScores("p022_names.txt");
        System.out.println(namesScores.getNamesSet());
        Map<String, Integer> mapa = namesScores.calculate();
        System.out.println(mapa);
        System.out.println(mapa.get("COLIN"));
    }
}
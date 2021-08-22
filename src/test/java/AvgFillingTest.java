import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AvgFillingTest {

    @Test
    void doFill() {
        AvgFilling avg = new AvgFilling();
        String rez = avg.doFill("_ _ _ 10 _ 20 _ _ _ _ _");
        assertEquals("-5 0 5 10 15 20 25 30 35 40 45", rez);
    }
}
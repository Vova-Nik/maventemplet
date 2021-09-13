package Stream;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StreamGeekBrainsTest {

    @Test
    void run() {
        StreamGeekBrains sgb=new StreamGeekBrains();
        sgb.run();
        List<Foo> foos = sgb.getFoos();
//        System.out.println(foos);
    }
}
package Stream;

import lombok.Getter;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Getter
public class StreamGeekBrains {
    List<Foo> foos = new ArrayList<>();

    public void run() {
        IntStream.range(1, 4)
                .forEach(i -> foos.add(new Foo("Foo" + i)));

        foos.forEach(f -> IntStream.range(1, 4)
                .forEach (i->f.bars.add(new Bar("Bar" + i + " <- " + f.getName()))));
        foos.stream().flatMap(f->f.bars.stream()).forEach(System.out::println);
    }


}

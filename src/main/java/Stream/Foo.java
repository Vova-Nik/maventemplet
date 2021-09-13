package Stream;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Foo {
    private String name;
    List<Bar> bars = new ArrayList<>();
    Foo(String name){
        this.name=name;
    }
}

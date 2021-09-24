package Stream;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Bar {
    private String name;
    Bar(String name){
        this.name=name;
    }
}

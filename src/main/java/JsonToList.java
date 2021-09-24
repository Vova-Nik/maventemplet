import java.util.List;
import java.util.Map;

public class JsonToList {
    private List<Map<String, String>> list;
    private final String json;

    public JsonToList(String json) {
        this.json = json;
    }
    public List<Map<String, String>> getList(){
        return list;
    }

    private void parser(){

    }

}
/*

{
        "data": [
            {"name": "John", "email": "john2@mail.com"},
            {"name": "John", "email": "john1@mail.com"},
            {"name": "Jane", "email": "jane@mail.com"}
        ]
}

 */
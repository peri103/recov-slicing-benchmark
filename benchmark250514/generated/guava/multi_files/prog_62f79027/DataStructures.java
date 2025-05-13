import java.util.HashMap;
import java.util.Map;

public class DataStructures {
    private Map<String, String> hashMap;

    public DataStructures() {
        hashMap = new HashMap<>();
        hashMap.put("apple", "fruit");
        hashMap.put("carrot", "vegetable");
    }

    public void manipulateData() {
        hashMap.put("banana", "fruit");
        hashMap.remove("carrot");
        hashMap.put("potato", "vegetable");
    }

    public void printData() {
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " is a " + entry.getValue());
        }
    }
}

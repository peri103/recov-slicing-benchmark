import java.util.ArrayList;
import java.util.HashMap;

public class DataStructures {
    private ArrayList<String> sampleList = new ArrayList<>();
    private HashMap<String, Integer> sampleMap = new HashMap<>();

    public DataStructures() {
        sampleList.add("Sample1");
        sampleList.add("Sample2");

        sampleMap.put("Key1", 100);
        sampleMap.put("Key2", 200);
    }

    public void displayListItems() {
        for (String item : sampleList) {
            System.out.println("List item: " + item);
        }
    }

    public void displayMapItems() {
        for (String key : sampleMap.keySet()) {
            System.out.println("Map key: " + key + ", value: " + sampleMap.get(key));
        }
    }
}

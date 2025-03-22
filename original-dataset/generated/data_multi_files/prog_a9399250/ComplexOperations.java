import java.util.ArrayList;
import java.util.HashMap;

public class ComplexOperations {
    private ArrayList<String> stringList = new ArrayList<>();
    private HashMap<String, Integer> map = new HashMap<>();

    public ComplexOperations() {
        stringList.add("Hello");
        stringList.add("World");
        map.put("One", 1);
        map.put("Two", 2);
    }

    public void printStringList() {
        for (String str : stringList) {
            System.out.println("ArrayList element: " + str);
        }
    }

    public void printMap() {
        for (String key : map.keySet()) {
            System.out.println("HashMap element: " + key + " -> " + map.get(key));
        }
    }
}

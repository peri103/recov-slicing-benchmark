import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize a HashMap and put some values
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("A", "Apple");
        hashMap.put("B", "Banana");

        // Create an ImmutableList and add some values
        ImmutableList.Builder<String> listBuilder = new ImmutableList.Builder<>();
        listBuilder.add("Orange");
        listBuilder.add("Grape");

        // Use the ImmutableMap.Builder to add a key-value pair
        ImmutableMap.Builder<String, Integer> builder = new ImmutableMap.Builder<>();
        /* write */ builder.put("key", 42);

        // Build the ImmutableList
        ImmutableList<String> fruitList = listBuilder.build();

        // Perform some operations on the fruitList
        for (String fruit : fruitList) {
            System.out.println("Fruit: " + fruit);
        }

        // Build the ImmutableMap
        ImmutableMap<String, Integer> map = builder.build();

        // Perform some operations on the HashMap
        for (String key : hashMap.keySet()) {
            System.out.println("HashMap Value: " + hashMap.get(key));
        }

        // Read the value from the ImmutableMap
        /* read */ Integer value = map.get("key");
        System.out.println("Value from ImmutableMap: " + value);

        // Perform additional operations on the ImmutableMap
        for (String mapKey : map.keySet()) {
            System.out.println("ImmutableMap Key: " + mapKey);
        }
    }
}
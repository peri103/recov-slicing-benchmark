import org.apache.commons.lang3.text.StrBuilder;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        StrBuilder strBuilder = new StrBuilder("Hello World!");
        ArrayList<String> arrayList = new ArrayList<>();
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Add some elements to the arrayList
        arrayList.add("Element1");
        arrayList.add("Element2");

        // Add some key-value pairs to the hashMap
        hashMap.put("Key1", 100);
        hashMap.put("Key2", 200);

        // Perform some operations on StrBuilder
        strBuilder.append(" Welcome to the universe.");
        int index = strBuilder.indexOf("universe");
        strBuilder.insert(index, "vast ");

        // Use the original write method
        /* write */ strBuilder.delete(5, 11); // Deletes " World" from "Hello World!"

        // Use the arrayList
        for (String element : arrayList) {
            System.out.println("ArrayList Element: " + element);
        }

        // Modify the hashMap
        if (hashMap.containsKey("Key1")) {
            int value = hashMap.get("Key1");
            hashMap.put("Key1", value + 50);
        }

        // Print the modified hashMap
        for (String key : hashMap.keySet()) {
            System.out.println("HashMap Key: " + key + ", Value: " + hashMap.get(key));
        }

        // Perform more operations on StrBuilder
        strBuilder.replaceFirst("Hello", "Hi");

        // Use the original read method
        /* read */ String result = strBuilder.toString();
        System.out.println("Final StrBuilder content: " + result);
    }
}
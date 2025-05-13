import org.apache.commons.collections4.map.StaticBucketMap;
import java.util.HashMap;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        StaticBucketMap map = new StaticBucketMap();
        HashMap<String, Integer> hashMap = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        
        hashMap.put("number", 42);
        list.add("Hello");
        list.add("World");

        /* write */ map.put("key", "value");

        for (String str : list) {
            System.out.println(str);
        }

        int number = hashMap.get("number");
        System.out.println("Number: " + number);

        list.add("Apache");
        list.add("Commons");

        for (String str : list) {
            System.out.println("List item: " + str);
        }

        /* read */ String value = (String) map.get("key");
        System.out.println("Map value: " + value);

        hashMap.put("anotherNumber", 100);
        int anotherNumber = hashMap.get("anotherNumber");
        System.out.println("Another Number: " + anotherNumber);

        list.add("Collections");
        list.add("Library");

        for (String str : list) {
            System.out.println("Updated list item: " + str);
        }
    }
}
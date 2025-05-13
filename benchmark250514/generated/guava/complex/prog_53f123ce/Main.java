import com.google.common.collect.LinkedListMultimap;
import java.util.HashMap;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        LinkedListMultimap<String, Integer> multimap = LinkedListMultimap.create();
        HashMap<String, String> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        map.put("first", "Hello");
        map.put("second", "World");
        list.add(10);
        list.add(20);

        /* write */ multimap.put("key", 123);

        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }

        for (Integer num : list) {
            System.out.println("List item: " + num);
        }

        int sum = 0;
        for (Integer num : list) {
            sum += num;
        }
        System.out.println("Sum of list items: " + sum);

        LinkedListMultimap<String, String> stringMultimap = LinkedListMultimap.create();
        stringMultimap.put("greeting", "Hello");
        stringMultimap.put("greeting", "Hi");

        System.out.println("String Multimap:");
        for (String greeting : stringMultimap.get("greeting")) {
            System.out.println(greeting);
        }

        /* read */ Integer value = multimap.get("key").iterator().next();
        System.out.println("Multimap value: " + value);
    }
}
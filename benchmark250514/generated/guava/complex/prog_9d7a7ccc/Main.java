import com.google.common.collect.ForwardingMap;
import com.google.common.collect.ForwardingList;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // ForwardingMap requires a delegate map for operations
        Map<String, Integer> delegateMap = new HashMap<>();
        ForwardingMap<String, Integer> map = new ForwardingMap<String, Integer>() {
            @Override
            protected Map<String, Integer> delegate() {
                return delegateMap;
            }
        };

        // ForwardingList requires a delegate list for operations
        List<Integer> delegateList = new ArrayList<>();
        ForwardingList<Integer> list = new ForwardingList<Integer>() {
            @Override
            protected List<Integer> delegate() {
                return delegateList;
            }
        };

        // Using the ForwardingList to add some elements
        list.add(10);
        list.add(20);
        list.add(30);

        /* write */ map.put("key", 42);

        // Perform some operations with the list
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        System.out.println("Sum of list elements: " + sum);

        // Perform some operations with the map
        map.put("anotherKey", 100);
        int anotherValue = map.get("anotherKey");
        System.out.println("Value for 'anotherKey': " + anotherValue);

        // More complex operations
        for (int i = 0; i < list.size(); i++) {
            map.put("listElement" + i, list.get(i));
        }

        // Retrieve and print values from the map
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Value for 'listElement" + i + "': " + map.get("listElement" + i));
        }

        /* read */ int value = map.get("key");
        System.out.println("Value for 'key': " + value);

        // Further operations
        list.add(40);
        list.add(50);
        for (int num : list) {
            System.out.println("List element: " + num);
        }
    }
}
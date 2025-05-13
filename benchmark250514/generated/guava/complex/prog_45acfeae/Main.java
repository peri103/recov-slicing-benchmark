import com.google.common.collect.ForwardingList;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create an anonymous subclass of ForwardingList to use the provided write and read methods
        ForwardingList<Integer> forwardingList = new ForwardingList<Integer>() {
            private final List<Integer> delegate = new ArrayList<>();

            @Override
            protected List<Integer> delegate() {
                return delegate;
            }
        };

        // Additional code using HashMap
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        // Iterate over the map and print the values
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Additional code using another list
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");

        // Print elements of stringList
        for (String str : stringList) {
            System.out.println("String List Element: " + str);
        }

        /* write */ forwardingList.add(42);

        // Perform some operations with forwardingList
        forwardingList.add(100);
        forwardingList.add(200);

        // Print all elements in forwardingList
        for (Integer num : forwardingList) {
            System.out.println("Forwarding List Element: " + num);
        }

        // Additional calculations
        int sum = 0;
        for (int i = 0; i < forwardingList.size(); i++) {
            sum += forwardingList.get(i);
        }
        System.out.println("Sum of elements in forwardingList: " + sum);

        /* read */ int value = forwardingList.get(0);
        System.out.println("Read value: " + value);

        // Additional code with complex operations
        List<Integer> complexList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            complexList.add(i * 10);
        }
        for (int i = 0; i < complexList.size(); i++) {
            System.out.println("Complex List Element: " + complexList.get(i));
        }
    }
}
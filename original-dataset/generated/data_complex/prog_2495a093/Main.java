import java.util.concurrent.CopyOnWriteArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
        CopyOnWriteArrayList<String> stringList = new CopyOnWriteArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();

        // Adding elements to the string list
        stringList.add("Hello");
        stringList.add("World");

        // Adding elements to the map
        map.put("One", 1);
        map.put("Two", 2);

        // Iterating over the map
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Adding elements to a new CopyOnWriteArrayList
        CopyOnWriteArrayList<Double> doubleList = new CopyOnWriteArrayList<>();
        doubleList.add(3.14);
        doubleList.add(2.71);

        // Processing elements in doubleList
        for (Double d : doubleList) {
            System.out.println("Double value: " + d);
        }

        /* write */ list.add(42);

        // Performing operations on stringList
        for (String s : stringList) {
            System.out.println("String value: " + s);
        }

        // Additional logic before reading the value
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);

        /* read */ int value = list.get(0);
        System.out.println("Read value: " + value);

        // Further operations after reading the value
        List<Integer> squaredValues = new CopyOnWriteArrayList<>();
        for (int i = 0; i < 5; i++) {
            squaredValues.add(i * i);
        }
        for (Integer squaredValue : squaredValues) {
            System.out.println("Squared value: " + squaredValue);
        }
    }
}
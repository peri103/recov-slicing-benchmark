import com.google.common.collect.ForwardingList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ForwardingList<Integer> list = new ForwardingList<Integer>() {
            private final ArrayList<Integer> delegate = new ArrayList<>();

            @Override
            protected ArrayList<Integer> delegate() {
                return delegate;
            }
        };

        /* write */ list.add(42);

        // Additional complex code
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        ArrayList<String> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys);

        for (String key : keys) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 5);
        }

        Collections.shuffle(numbers);
        System.out.println("Shuffled numbers: " + numbers);

        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println("Sum of numbers: " + sum);

        /* read */ int value = list.get(0);
        System.out.println(value);
    }
}
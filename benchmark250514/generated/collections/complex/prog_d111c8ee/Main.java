import org.apache.commons.collections4.queue.CircularFifoQueue;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        CircularFifoQueue<Integer> queue = new CircularFifoQueue<>(10);
        ArrayList<String> stringList = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();

        stringList.add("Hello");
        stringList.add("World");
        map.put("One", 1);
        map.put("Two", 2);

        /* write */ queue.add(42);

        for (String str : stringList) {
            System.out.println(str);
        }

        if (map.containsKey("One")) {
            queue.add(100);
        }

        int sum = 0;
        for (Integer num : queue) {
            sum += num;
        }
        System.out.println("Sum of queue elements: " + sum);

        /* read */ Integer value = queue.peek();
        System.out.println("Peeked value: " + value);

        for (String key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 10);
        }

        for (Integer num : numbers) {
            System.out.println("Number: " + num);
        }
    }
}
import java.util.concurrent.LinkedTransferQueue;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        LinkedTransferQueue<Integer> queue = new LinkedTransferQueue<>();
        ArrayList<String> stringList = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();

        try {
            /* write */ queue.put(42);
            
            // Adding elements to stringList
            stringList.add("Hello");
            stringList.add("World");

            // Adding key-value pairs to map
            map.put("One", 1);
            map.put("Two", 2);

            // Processing stringList
            for (String str : stringList) {
                System.out.println("StringList item: " + str);
            }

            // Processing map
            for (String key : map.keySet()) {
                System.out.println("Map item: " + key + " = " + map.get(key));
            }

            // Performing some calculations
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += i;
            }
            System.out.println("Sum of numbers from 0 to 9: " + sum);

            /* read */ int value = queue.take();
            System.out.println("Value from queue: " + value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
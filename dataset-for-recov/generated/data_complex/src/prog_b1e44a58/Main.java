import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        int sum = 0;

        // Adding elements to the map
        map.put("first", 10);
        map.put("second", 20);
        map.put("third", 30);

        // Iterating over the map and calculating the sum of values
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            sum += entry.getValue();
        }

        // Adding the sum to the list
        list.add(sum);

        // Performing a complex operation
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        list.add(product);

        // Adding more elements to the list
        for (int i = 0; i < 5; i++) {
            list.add(i * 2);
        }

        // Another complex operation with conditions
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.set(i, list.get(i) * 3);
            }
        }

        // Printing the final list
        System.out.println("Final List: " + list);

        // Original write-read pair
        /* write */ list.add(1);
        int someCalculation = sum + product;
        for (int i = 0; i < someCalculation; i++) {
            if (i % 10 == 0) {
                System.out.println("Processing: " + i);
            }
        }
        /* read */ int value = list.get(0);
        System.out.println("Value from original write-read pair: " + value);
    }
}
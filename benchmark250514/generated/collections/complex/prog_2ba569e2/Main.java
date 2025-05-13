import org.apache.commons.collections4.set.ListOrderedSet;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ListOrderedSet<String> set = new ListOrderedSet<>();
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "First");
        map.put(2, "Second");
        map.put(3, "Third");
        
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            set.add(entry.getValue());
        }
        
        /* write */ set.add("Hello, World!");
        
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        
        StringBuilder builder = new StringBuilder();
        builder.append("Sum of first 10 numbers: ").append(sum);
        
        System.out.println(builder.toString());
        
        String retrievedValue = set.get(0);
        if (retrievedValue.equals("Hello, World!")) {
            System.out.println("Correct value retrieved from set.");
        } else {
            System.out.println("Unexpected value.");
        }
        
        /* read */ String value = set.get(3);
        System.out.println(value);
        
        for (String str : set) {
            System.out.println("Set element: " + str);
        }
        
        int factorial = 1;
        for (int i = 1; i <= 5; i++) {
            factorial *= i;
        }
        
        System.out.println("Factorial of 5 is: " + factorial);
    }
}
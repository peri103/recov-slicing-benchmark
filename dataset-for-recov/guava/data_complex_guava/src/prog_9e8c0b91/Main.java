import com.google.common.util.concurrent.AtomicDouble;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        AtomicDouble atomicDouble = new AtomicDouble(0.0);
        Map<String, Integer> map = new HashMap<>();
        map.put("initial", 10);
        map.put("increment", 5);
        
        /* write */ double newValue = atomicDouble.addAndGet(5.0);
        
        int incrementValue = map.get("increment");
        int initialValue = map.get("initial");
        int finalValue = initialValue + incrementValue;

        System.out.println("Final Value after increment: " + finalValue);
        
        // Additional unrelated code for complexity
        for (int i = 0; i < 3; i++) {
            System.out.println("Loop iteration: " + (i + 1));
        }

        /* read */ double value = atomicDouble.get();
        System.out.println("Written Value: " + newValue);
        System.out.println("Read Value: " + value);
        
        // More unrelated complexity
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
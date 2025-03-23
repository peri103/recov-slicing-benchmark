import com.google.common.base.Optional;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        /* write */ Optional<Integer> optionalValue = Optional.of(42);
        
        ArrayList<String> stringList = new ArrayList<>();
        HashMap<String, Integer> stringIntegerMap = new HashMap<>();
        
        stringList.add("Hello");
        stringList.add("World");
        
        for (String str : stringList) {
            stringIntegerMap.put(str, str.length());
        }
        
        /* read */ int value = optionalValue.get();
        System.out.println("Value from Optional: " + value);
        
        for (String key : stringIntegerMap.keySet()) {
            System.out.println("Key: " + key + ", Length: " + stringIntegerMap.get(key));
        }
        
        // Additional unrelated code
        for (int i = 0; i < 5; i++) {
            System.out.println("Square of " + i + " is " + (i * i));
        }
    }
}
import com.google.common.collect.MutableClassToInstanceMap;
import com.google.common.collect.ClassToInstanceMap;

public class Main {
    public static void main(String[] args) {
        // Create an instance of MutableClassToInstanceMap
        ClassToInstanceMap<Object> map = MutableClassToInstanceMap.create();

        // Create an instance of Integer to store in the map
        Integer number = 42;

        // Use the putInstance method to store the Integer instance in the map
        /* write */ map.putInstance(Integer.class, number);

        // Use the getInstance method to retrieve the Integer instance from the map
        /* read */ Integer retrievedNumber = map.getInstance(Integer.class);

        // Print the retrieved value to verify correctness
        System.out.println(retrievedNumber);
    }
}
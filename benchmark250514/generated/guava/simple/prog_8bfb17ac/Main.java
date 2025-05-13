import com.google.common.collect.MutableClassToInstanceMap;
import com.google.common.collect.ClassToInstanceMap;

public class Main {
    public static void main(String[] args) {
        // Create an instance of MutableClassToInstanceMap
        ClassToInstanceMap<Object> map = MutableClassToInstanceMap.create();

        // Create an instance of Integer to write into the map
        Integer number = 42;

        /* write */ map.putInstance(Integer.class, number);

        /* read */ Integer retrievedNumber = map.getInstance(Integer.class);

        // Print the retrieved value
        System.out.println(retrievedNumber);
    }
}
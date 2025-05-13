import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initializing a builder for ImmutableList
        Builder<String> builder = ImmutableList.builder();
        
        // Creating an ArrayList and adding elements to it
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Element 1");
        arrayList.add("Element 2");
        
        // Creating a HashMap and populating it
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        
        // Adding elements from ArrayList to the ImmutableList builder
        for (String element : arrayList) {
            builder.add(element);
        }
        
        // Adding a new element directly to the builder
        /* write */ builder.add("Hello, World!");
        
        // Building the ImmutableList
        ImmutableList<String> list = builder.build();
        
        // Performing operations on the HashMap
        for (int key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
        
        // More operations on ArrayList
        arrayList.add("Element 3");
        for (String element : arrayList) {
            System.out.println("ArrayList Element: " + element);
        }
        
        // Reading from the ImmutableList
        /* read */ String value = list.get(2);
        System.out.println(value);
        
        // Additional operations to increase complexity
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);
    }
}
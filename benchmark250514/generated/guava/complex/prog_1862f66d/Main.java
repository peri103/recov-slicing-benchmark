import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableList
        ImmutableList.Builder<Integer> builder = ImmutableList.builder();
        
        // Create some unrelated structures to increase complexity
        ArrayList<String> stringList = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        
        // Add some items to the string list
        stringList.add("Alpha");
        stringList.add("Beta");
        stringList.add("Gamma");
        
        // Add some items to the map
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        
        // Add elements to the ImmutableList builder
        /* write */ builder.add(1);
        builder.add(2);
        builder.add(3);
        
        // Perform operations on the string list
        for (String str : stringList) {
            System.out.println("String List Item: " + str);
        }
        
        // Perform operations on the map
        for (String key : map.keySet()) {
            System.out.println("Map Key: " + key + ", Value: " + map.get(key));
        }
        
        // Build the ImmutableList
        ImmutableList<Integer> list = builder.build();
        
        // Perform some calculations
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        System.out.println("Sum of ImmutableList: " + sum);
        
        // Read the first element from the ImmutableList
        /* read */ int value = list.get(0);
        
        // Output the read value
        System.out.println("Read Value: " + value);
        
        // Additional unrelated operations
        ArrayList<Integer> numberList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numberList.add(i * 10);
        }
        
        for (Integer num : numberList) {
            System.out.println("Number List Item: " + num);
        }
    }
}
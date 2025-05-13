import com.google.common.collect.ImmutableClassToInstanceMap;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableList;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableClassToInstanceMap
        ImmutableClassToInstanceMap.Builder<Object> builder = ImmutableClassToInstanceMap.builder();
        
        // Add an instance to the map
        /* write */ builder.put(String.class, "Hello, World!");
        
        // Create another ImmutableList to demonstrate complexity
        ImmutableList.Builder<Integer> listBuilder = ImmutableList.builder();
        for (int i = 0; i < 5; i++) {
            listBuilder.add(i * 10);
        }
        ImmutableList<Integer> numberList = listBuilder.build();
        
        // Perform some operations on the list
        int sum = 0;
        for (Integer number : numberList) {
            sum += number;
        }
        System.out.println("Sum of numbers: " + sum);
        
        // Build the ImmutableClassToInstanceMap
        ImmutableClassToInstanceMap<Object> map = builder.build();
        
        // Create another ImmutableClassToInstanceMap with different types
        ImmutableClassToInstanceMap.Builder<Object> anotherBuilder = ImmutableClassToInstanceMap.builder();
        anotherBuilder.put(Integer.class, 42);
        ImmutableClassToInstanceMap<Object> anotherMap = anotherBuilder.build();
        
        // Retrieve the instance from the original map
        /* read */ String value = (String) map.getInstance(String.class);
        
        // Output the value
        System.out.println(value);
        
        // Retrieve the instance from the second map
        Integer numberValue = (Integer) anotherMap.getInstance(Integer.class);
        System.out.println("Number from another map: " + numberValue);
        
        // Additional operations to increase complexity
        for (int i = 0; i < numberList.size(); i++) {
            System.out.println("Number at index " + i + ": " + numberList.get(i));
        }
    }
}
import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.ImmutableList;

public class Main {
    public static void main(String[] args) {
        // Create a builder to construct an ImmutableSortedMap
        ImmutableSortedMap.Builder<String, Integer> builder = ImmutableSortedMap.naturalOrder();
        
        // Add some additional complexity with a list
        ImmutableList.Builder<String> listBuilder = ImmutableList.builder();
        listBuilder.add("apple");
        listBuilder.add("banana");
        ImmutableList<String> list = listBuilder.build();

        // Iterate over the list and do some operations
        for (String fruit : list) {
            System.out.println("Fruit: " + fruit);
        }

        // Create another map for complexity
        ImmutableSortedMap.Builder<String, Integer> anotherBuilder = ImmutableSortedMap.naturalOrder();
        anotherBuilder.put("key2", 200);
        ImmutableSortedMap<String, Integer> anotherMap = anotherBuilder.build();
        Integer anotherValue = anotherMap.get("key2");
        System.out.println("Another Value: " + anotherValue);

        /* write */ builder.put("key1", 100);
        
        // Perform some mathematical operations
        int a = 5;
        int b = 10;
        int c = a * b;
        System.out.println("Multiplication Result: " + c);

        // Build the ImmutableSortedMap
        ImmutableSortedMap<String, Integer> map = builder.build();
        
        // Additional complex operations
        if (c > 20) {
            System.out.println("Result is greater than 20");
        } else {
            System.out.println("Result is 20 or less");
        }

        /* read */ Integer value = map.get("key1");
        
        System.out.println("Value from map: " + value);

        // Final loop for complexity
        for (int i = 0; i < 3; i++) {
            System.out.println("Iteration: " + i);
        }
    }
}
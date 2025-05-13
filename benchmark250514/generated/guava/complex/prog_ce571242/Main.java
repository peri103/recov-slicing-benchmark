import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableList;

public class Main {
    public static void main(String[] args) {
        // Initialize a builder for ImmutableMap
        ImmutableMap.Builder<String, Integer> builder = ImmutableMap.builder();
        
        // Additional unrelated code to add complexity
        ImmutableList.Builder<String> listBuilder = ImmutableList.builder();
        listBuilder.add("First");
        listBuilder.add("Second");
        ImmutableList<String> list = listBuilder.build();
        
        for (String item : list) {
            System.out.println("List item: " + item);
        }
        
        // More unrelated code
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);
        
        /* write */ builder.put("key", 42);
        
        // Additional operations before reading from the map
        ImmutableMap<String, Integer> anotherMap = ImmutableMap.of("A", 1, "B", 2, "C", 3);
        for (String k : anotherMap.keySet()) {
            System.out.println("Another map entry: " + k + " -> " + anotherMap.get(k));
        }
        
        // Build the ImmutableMap
        ImmutableMap<String, Integer> map = builder.build();
        
        // Some additional logic to make the program more complex
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of first 5 numbers: " + product);
        
        /* read */ Integer value = map.get("key");
        
        // Print the value
        System.out.println("Value from map: " + value);
        
        // More unrelated code
        ImmutableList.Builder<Integer> numberListBuilder = ImmutableList.builder();
        for (int i = 1; i <= 5; i++) {
            numberListBuilder.add(i * 10);
        }
        ImmutableList<Integer> numberList = numberListBuilder.build();
        
        for (Integer num : numberList) {
            System.out.println("Number list item: " + num);
        }
    }
}
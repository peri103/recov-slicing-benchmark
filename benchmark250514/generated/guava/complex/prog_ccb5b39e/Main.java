import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableList;

public class Main {
    public static void main(String[] args) {
        ImmutableMap<String, Integer> map;
        ImmutableList<String> list = ImmutableList.of("apple", "banana", "cherry");
        
        // Some unrelated code to make the program more complex
        int sum = 0;
        for (String fruit : list) {
            sum += fruit.length();
        }
        System.out.println("Total length of fruit names: " + sum);
        
        /* write */ map = ImmutableMap.<String, Integer>builder().put("key", 42).build();
        
        // Another unrelated code block
        ImmutableMap<String, String> fruitMap = ImmutableMap.<String, String>builder()
                .put("apple", "red")
                .put("banana", "yellow")
                .put("cherry", "red")
                .build();
        
        String color = fruitMap.get("banana");
        System.out.println("Banana is " + color);
        
        // More unrelated code
        int maxFruitLength = 0;
        for (String fruit : list) {
            if (fruit.length() > maxFruitLength) {
                maxFruitLength = fruit.length();
            }
        }
        System.out.println("Longest fruit name length: " + maxFruitLength);
        
        /* read */ int value = map.get("key");
        System.out.println(value);
        
        // Final unrelated code block
        ImmutableList<Integer> numbers = ImmutableList.of(10, 20, 30, 40);
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        System.out.println("Sum of numbers: " + total);
    }
}
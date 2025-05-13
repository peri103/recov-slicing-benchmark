import com.google.common.collect.MutableClassToInstanceMap;
import com.google.common.collect.ClassToInstanceMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize a MutableClassToInstanceMap
        ClassToInstanceMap<Object> map = MutableClassToInstanceMap.create();
        
        // Create an instance of a class to store
        String stringInstance = "Hello, world!";
        
        // Write the instance to the map using putInstance
        /* write */ map.putInstance(String.class, stringInstance);
        
        // Additional unrelated code to increase complexity
        Map<String, Integer> scoreMap = new HashMap<>();
        scoreMap.put("Alice", 90);
        scoreMap.put("Bob", 85);
        scoreMap.put("Charlie", 88);
        
        int totalScore = 0;
        for (Map.Entry<String, Integer> entry : scoreMap.entrySet()) {
            totalScore += entry.getValue();
            System.out.println("Score of " + entry.getKey() + ": " + entry.getValue());
        }
        
        double averageScore = totalScore / (double) scoreMap.size();
        System.out.println("Average Score: " + averageScore);
        
        // More unrelated code
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of numbers: " + sum);
        
        // Read the instance back from the map using getInstance
        /* read */ String retrievedInstance = map.getInstance(String.class);
        
        // Print the retrieved instance
        System.out.println("Retrieved instance: " + retrievedInstance);
        
        // Final unrelated code block
        Map<Integer, String> reverseMap = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            reverseMap.put(numbers[i], "Number " + numbers[i]);
        }
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(reverseMap.get(numbers[i]));
        }
    }
}
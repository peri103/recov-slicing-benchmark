import com.google.common.collect.TreeMultiset;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        TreeMultiset<Integer> multiset = TreeMultiset.create();
        Map<String, Integer> map = new HashMap<>();
        
        // Additional operations with a HashMap
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        
        int sum = 0;
        for (String key : map.keySet()) {
            sum += map.get(key);
        }
        System.out.println("Sum of values in map: " + sum);
        
        /* write */ multiset.add(5);
        
        // More complex operations with the multiset
        for (int i = 0; i < 10; i++) {
            multiset.add(i);
        }
        
        int totalUniqueElements = multiset.elementSet().size();
        System.out.println("Total unique elements in multiset: " + totalUniqueElements);
        
        // Some unrelated operations
        int factorial = 1;
        for (int i = 1; i <= 5; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of 5: " + factorial);
        
        /* read */ int count = multiset.count(5);
        System.out.println("Count of 5 in multiset: " + count);
        
        // More operations on the multiset
        multiset.add(5, 2); // Add two more instances of 5
        int newCount = multiset.count(5);
        System.out.println("New count of 5 in multiset: " + newCount);
        
        // Final unrelated operation
        int squareSum = 0;
        for (int i = 1; i <= 3; i++) {
            squareSum += i * i;
        }
        System.out.println("Sum of squares from 1 to 3: " + squareSum);
    }
}
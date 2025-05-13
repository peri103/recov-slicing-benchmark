import org.apache.commons.collections4.set.ListOrderedSet;
import java.util.HashSet;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ListOrderedSet<String> set = ListOrderedSet.listOrderedSet(new HashSet<>());
        ArrayList<Integer> numbers = new ArrayList<>();
        
        // Adding numbers to the ArrayList
        for (int i = 1; i <= 5; i++) {
            numbers.add(i * 10);
        }
        
        // Print numbers
        for (Integer num : numbers) {
            System.out.println("Number: " + num);
        }
        
        /* write */ set.add("Hello, World!");
        
        // Adding more strings to the ListOrderedSet
        set.add("Apache");
        set.add("Commons");
        set.add("Collections");
        
        // Print all strings in the ListOrderedSet
        for (String str : set) {
            System.out.println("Set Element: " + str);
        }
        
        // Some unrelated calculations
        int sum = 0;
        for (Integer num : numbers) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);
        
        // More operations on the ListOrderedSet
        set.add("Library");
        
        // Print the first element in the ListOrderedSet
        /* read */ String value = set.get(0);
        System.out.println("Read Value: " + value);
        
        // Final operation on ArrayList
        numbers.add(60);
        System.out.println("Final number added: " + numbers.get(numbers.size() - 1));
    }
}
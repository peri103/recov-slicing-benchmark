import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

public class Main {
    public static void main(String[] args) {
        // Create an ImmutableSortedMap using the 'of' method
        /* write */ ImmutableSortedMap<String, Integer> map = ImmutableSortedMap.of("key", 42);

        // Create an ImmutableList and ImmutableSet to add complexity
        ImmutableList<String> list = ImmutableList.of("apple", "banana", "cherry");
        ImmutableSet<Integer> set = ImmutableSet.of(10, 20, 30);

        // Perform operations on the ImmutableList
        System.out.println("List elements:");
        for (String fruit : list) {
            System.out.println(fruit);
        }

        // Perform operations on the ImmutableSet
        System.out.println("\nSet elements:");
        for (Integer number : set) {
            System.out.println(number);
        }

        // Add more logic to manipulate data
        int sum = 0;
        for (Integer number : set) {
            sum += number;
        }
        System.out.println("\nSum of set elements: " + sum);

        // Conditional logic to demonstrate complexity
        if (sum > 50) {
            System.out.println("The sum is greater than 50.");
        } else {
            System.out.println("The sum is not greater than 50.");
        }

        // Read the value associated with the key using the 'get' method
        /* read */ Integer value = map.get("key");

        // Print the value to verify the correctness
        System.out.println("\nValue from map: " + value);

        // More operations to make the program complex
        int multipliedValue = value * 2;
        System.out.println("Multiplied value: " + multipliedValue);

        // Additional logic to work with the multiplied value
        if (multipliedValue > 80) {
            System.out.println("Multiplied value is greater than 80.");
        } else {
            System.out.println("Multiplied value is not greater than 80.");
        }
    }
}
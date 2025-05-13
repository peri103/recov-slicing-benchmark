import org.apache.commons.lang3.text.StrBuilder;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        StrBuilder strBuilder = new StrBuilder("Hello, World!");
        ArrayList<String> list = new ArrayList<>();
        HashMap<Integer, String> map = new HashMap<>();
        
        list.add("First");
        list.add("Second");
        
        map.put(1, "One");
        map.put(2, "Two");

        /* write */ strBuilder.reverse();

        // Perform some operations on the list
        for (String item : list) {
            System.out.println("List item: " + item);
        }

        // Perform some operations on the map
        for (Integer key : map.keySet()) {
            System.out.println("Map key: " + key + ", value: " + map.get(key));
        }

        // Perform a complex operation
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        // More string manipulations
        StrBuilder additionalStrBuilder = new StrBuilder("Another String");
        additionalStrBuilder.append(" Appended");
        System.out.println("Additional StringBuilder: " + additionalStrBuilder.toString());

        /* read */ String reversedString = strBuilder.toString();
        System.out.println("Reversed String: " + reversedString);

        // Perform some final operations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of numbers from 1 to 5: " + product);

        // Manipulate the list further
        list.add("Third");
        for (String item : list) {
            System.out.println("Updated List item: " + item);
        }
    }
}
import org.apache.commons.lang3.text.StrBuilder;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        StrBuilder strBuilder = new StrBuilder("Hello, World!");
        ArrayList<Integer> numbers = new ArrayList<>();
        HashMap<String, Integer> nameToAge = new HashMap<>();

        // Initialize the ArrayList with some values
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 10);
        }

        // Add some entries to the HashMap
        nameToAge.put("Alice", 30);
        nameToAge.put("Bob", 25);

        // Perform some operations on the ArrayList
        int sum = 0;
        for (Integer num : numbers) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);

        // Perform operations on the HashMap
        nameToAge.put("Charlie", 35);
        int ageOfAlice = nameToAge.get("Alice");
        System.out.println("Age of Alice: " + ageOfAlice);

        /* write */ strBuilder.replace(7, 12, "Universe");

        // More operations on the ArrayList
        numbers.add(100);
        numbers.remove(2);
        System.out.println("Numbers after modification: " + numbers);

        // More operations on the HashMap
        nameToAge.remove("Bob");
        System.out.println("Names in the map: " + nameToAge.keySet());

        /* read */ String result = strBuilder.toString();
        System.out.println(result);
    }
}
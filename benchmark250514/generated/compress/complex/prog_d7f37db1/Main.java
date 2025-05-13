import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        TarArchiveEntry entry = new TarArchiveEntry("");
        ArrayList<String> namesList = new ArrayList<>();
        HashMap<String, Integer> nameFrequency = new HashMap<>();

        /* write */ entry.setName("example.tar");

        // Adding names to the list
        namesList.add("example.tar");
        namesList.add("test.tar");
        namesList.add("sample.tar");

        // Counting frequency of each name
        for (String name : namesList) {
            nameFrequency.put(name, nameFrequency.getOrDefault(name, 0) + 1);
        }

        // Printing frequency of each name
        for (Map.Entry<String, Integer> entrySet : nameFrequency.entrySet()) {
            System.out.println("Name: " + entrySet.getKey() + ", Frequency: " + entrySet.getValue());
        }

        // Performing some unrelated calculations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i * 2;
        }
        System.out.println("Sum of first 10 even numbers: " + sum);

        /* read */ String name = entry.getName();
        System.out.println("Tar Archive Entry Name: " + name);

        // Further unrelated logic
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of first 5 numbers: " + product);
    }
}
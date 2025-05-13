import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TarArchiveEntry entry = new TarArchiveEntry("example.txt");
        List<String> linkNames = new ArrayList<>();
        
        // Adding some initial values to the list
        linkNames.add("initial_link");
        linkNames.add("another_link");

        // Complex operations with the list
        for (int i = 0; i < linkNames.size(); i++) {
            System.out.println("Link at index " + i + ": " + linkNames.get(i));
        }

        // Perform some calculations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        /* write */ entry.setLinkName("link_to_example");
        
        // More list operations
        linkNames.add(entry.getLinkName());
        linkNames.remove(0);
        
        // Perform some string operations
        StringBuilder sb = new StringBuilder();
        for (String name : linkNames) {
            sb.append(name).append(", ");
        }
        System.out.println("Link names: " + sb.toString());

        // Final read operation
        /* read */ String linkName = entry.getLinkName();
        System.out.println("Final link name: " + linkName);

        // Additional operations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of numbers from 1 to 5: " + product);
    }
}
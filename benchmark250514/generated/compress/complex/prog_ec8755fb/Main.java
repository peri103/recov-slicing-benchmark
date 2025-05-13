import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        TarArchiveEntry entry = new TarArchiveEntry("example.txt");
        ArrayList<String> namesList = new ArrayList<>();
        
        // Add some names to the list
        namesList.add("file1.txt");
        namesList.add("file2.txt");
        namesList.add("file3.txt");

        // Process each name
        for (String name : namesList) {
            TarArchiveEntry tempEntry = new TarArchiveEntry(name);
            tempEntry.setLinkName(name + "_link");
            System.out.println("Processed: " + tempEntry.getName() + " with link " + tempEntry.getLinkName());
        }

        /* write */ entry.setLinkName("linked_example.txt");

        // Simulate some complex logic
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i * i;
        }
        System.out.println("Sum of squares from 0 to 9: " + sum);

        // More complex logic
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 10);
        }
        int product = 1;
        for (Integer num : numbers) {
            product *= num + 1;
        }
        System.out.println("Product of modified numbers: " + product);

        /* read */ String linkName = entry.getLinkName();
        System.out.println("Original entry link name: " + linkName);
    }
}
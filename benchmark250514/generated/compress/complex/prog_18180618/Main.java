import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        TarArchiveEntry entry = new TarArchiveEntry("file.txt");
        ArrayList<String> names = new ArrayList<>();
        
        // Simulate complex operations
        for (int i = 0; i < 5; i++) {
            names.add("name" + i);
        }
        
        // Perform operations on the list
        for (String name : names) {
            System.out.println("Processing: " + name);
        }
        
        /* write */ entry.setLinkName("link.txt");
        
        // More operations
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 2);
        }
        
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        
        System.out.println("Sum of numbers: " + sum);
        
        // Retrieve the link name after various unrelated operations
        /* read */ String linkName = entry.getLinkName();
        System.out.println(linkName);
        
        // Additional operations with numbers list
        numbers.add(100);
        numbers.remove(0);
        
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("Number at index " + i + ": " + numbers.get(i));
        }
    }
}
import org.apache.commons.compress.archivers.jar.JarArchiveEntry;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        JarArchiveEntry entry = new JarArchiveEntry("example.jar");
        
        // Create a list to store entries
        List<JarArchiveEntry> entries = new ArrayList<>();
        entries.add(entry);
        
        // Set Unix mode for the entry
        /* write */ entry.setUnixMode(0755);

        // Add more entries with different names and modes
        JarArchiveEntry entry2 = new JarArchiveEntry("example2.jar");
        entry2.setUnixMode(0644);
        entries.add(entry2);
        
        JarArchiveEntry entry3 = new JarArchiveEntry("example3.jar");
        entry3.setUnixMode(0700);
        entries.add(entry3);
        
        // Iterate over the list and print entry names and modes
        for (JarArchiveEntry e : entries) {
            System.out.println("Entry name: " + e.getName() + ", Mode: " + e.getUnixMode());
        }

        // Perform some unrelated operations
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 10);
        }
        
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        
        System.out.println("Sum of numbers: " + sum);
        
        // Read Unix mode for the original entry
        /* read */ int mode = entry.getUnixMode();
        System.out.println("Original entry mode: " + mode);
        
        // Perform some additional logic
        if (mode == 0755) {
            System.out.println("The mode is set correctly for example.jar");
        } else {
            System.out.println("Unexpected mode for example.jar");
        }
    }
}
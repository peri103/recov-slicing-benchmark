import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create a ZipArchiveEntry
        ZipArchiveEntry entry = new ZipArchiveEntry("example.txt");
        
        // Create an ArrayList to store multiple entries
        ArrayList<ZipArchiveEntry> entryList = new ArrayList<>();
        entryList.add(entry);
        
        // Set Unix mode for the entry
        /* write */ entry.setUnixMode(644);
        
        // Add another entry with different properties
        ZipArchiveEntry anotherEntry = new ZipArchiveEntry("another_example.txt");
        anotherEntry.setUnixMode(755);
        entryList.add(anotherEntry);
        
        // Iterate over the entries and print their names
        for (ZipArchiveEntry zipEntry : entryList) {
            System.out.println("Entry Name: " + zipEntry.getName());
        }
        
        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);
        
        // Read the Unix mode from the original entry
        /* read */ int mode = entry.getUnixMode();
        System.out.println("Unix mode of example.txt: " + mode);
        
        // Further operations on the entries
        for (ZipArchiveEntry zipEntry : entryList) {
            if (zipEntry.getUnixMode() == 755) {
                System.out.println(zipEntry.getName() + " has mode 755");
            }
        }
        
        // Additional complex operations
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 100);
        }
        
        for (int number : numbers) {
            System.out.println("Number: " + number);
        }
    }
}
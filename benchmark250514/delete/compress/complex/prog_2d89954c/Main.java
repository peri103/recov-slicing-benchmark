import org.apache.commons.compress.archivers.ar.ArArchiveEntry;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArArchiveEntry entry = new ArArchiveEntry("example.txt", 100);
        ArrayList<String> fileNames = new ArrayList<>();
        
        // Adding some filenames to the list
        fileNames.add("file1.txt");
        fileNames.add("file2.txt");
        fileNames.add("file3.txt");
        
        // Setting Unix mode for the entry
        /* write */ entry.setUnixMode(755);
        
        // Perform operations on the fileNames list
        for (String fileName : fileNames) {
            ArArchiveEntry tempEntry = new ArArchiveEntry(fileName, 200);
            tempEntry.setUnixMode(644);
            System.out.println("Processed: " + fileName + " with mode: " + tempEntry.getUnixMode());
        }
        
        // More complex operations
        ArrayList<Integer> modes = new ArrayList<>();
        modes.add(644);
        modes.add(755);
        modes.add(600);
        
        int sumOfModes = 0;
        for (int mode : modes) {
            sumOfModes += mode;
        }
        System.out.println("Sum of modes: " + sumOfModes);
        
        // Reading Unix mode from the original entry
        /* read */ int mode = entry.getUnixMode();
        System.out.println("Original entry mode: " + mode);
        
        // Additional list operations
        ArrayList<Integer> sizes = new ArrayList<>();
        for (int i = 100; i <= 300; i += 100) {
            sizes.add(i);
        }
        
        for (int size : sizes) {
            System.out.println("Size: " + size);
        }
    }
}
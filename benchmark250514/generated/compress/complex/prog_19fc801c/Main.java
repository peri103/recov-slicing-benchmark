import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize a ZipArchiveEntry object
        ZipArchiveEntry zipEntry = new ZipArchiveEntry("example.txt");
        
        // Set the Unix mode using the write method
        /* write */ zipEntry.setUnixMode(0755);

        // Create a list of ZipArchiveEntry objects
        ArrayList<ZipArchiveEntry> zipEntries = new ArrayList<>();
        zipEntries.add(zipEntry);
        zipEntries.add(new ZipArchiveEntry("example2.txt"));
        
        // Create a HashMap to store entry names and their sizes
        HashMap<String, Long> entrySizes = new HashMap<>();
        for (ZipArchiveEntry entry : zipEntries) {
            entrySizes.put(entry.getName(), entry.getSize());
        }

        // Perform some unrelated operations
        int totalSize = 0;
        for (String name : entrySizes.keySet()) {
            Long size = entrySizes.get(name);
            if (size != null) {
                totalSize += size;
            }
        }
        
        // Output total size
        System.out.println("Total Size: " + totalSize);

        // Read the Unix mode using the read method
        /* read */ int unixMode = zipEntry.getUnixMode();
        
        // Output the Unix mode
        System.out.println("Unix Mode: " + unixMode);

        // Additional complex logic
        ArrayList<Integer> numberList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numberList.add(i * i);
        }

        int sumOfSquares = 0;
        for (int number : numberList) {
            sumOfSquares += number;
        }
        
        // Output the sum of squares
        System.out.println("Sum of Squares: " + sumOfSquares);
    }
}
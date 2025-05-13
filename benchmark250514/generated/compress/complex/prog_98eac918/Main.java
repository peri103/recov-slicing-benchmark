import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ZipArchiveEntry zipEntry = new ZipArchiveEntry("example.txt");
        ArrayList<String> fileNames = new ArrayList<>();
        
        // Adding some unrelated operations
        for (int i = 0; i < 5; i++) {
            fileNames.add("file" + i + ".txt");
        }
        
        for (String fileName : fileNames) {
            System.out.println("Processing: " + fileName);
        }
        
        // Some more unrelated operations
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers is: " + sum);
        
        /* write */ zipEntry.setExternalAttributes(12345L);
        
        // Adding more complexity
        ArrayList<ZipArchiveEntry> zipEntries = new ArrayList<>();
        zipEntries.add(zipEntry);
        
        for (ZipArchiveEntry entry : zipEntries) {
            System.out.println("Entry name: " + entry.getName());
        }
        
        /* read */ long attributes = zipEntry.getExternalAttributes();
        
        System.out.println("External attributes: " + attributes);
        
        // Additional operations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of first 5 numbers is: " + product);
    }
}
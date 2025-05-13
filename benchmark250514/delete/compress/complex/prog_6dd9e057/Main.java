import org.apache.commons.compress.archivers.ar.ArArchiveEntry;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Original write-read pair
        ArArchiveEntry entry = new ArArchiveEntry("example.txt", 1000);
        /* write */ entry.setCompressedSize(500);
        
        // Additional code to make the program more complex
        ArrayList<ArArchiveEntry> archiveList = new ArrayList<>();
        archiveList.add(entry);
        
        ArArchiveEntry anotherEntry = new ArArchiveEntry("another_example.txt", 1500);
        anotherEntry.setCompressedSize(750);
        archiveList.add(anotherEntry);

        for (ArArchiveEntry arEntry : archiveList) {
            System.out.println("Entry Name: " + arEntry.getName());
            System.out.println("Original Size: " + arEntry.getSize());
        }
        
        // Manipulating the list to add complexity
        ArrayList<Long> compressedSizes = new ArrayList<>();
        for (ArArchiveEntry arEntry : archiveList) {
            compressedSizes.add(arEntry.getCompressedSize());
        }

        for (Long size : compressedSizes) {
            System.out.println("Compressed Size: " + size);
        }

        // Continuing with original read operation
        /* read */ long compressedSize = entry.getCompressedSize();
        System.out.println("Read Compressed Size: " + compressedSize);

        // Further manipulation and complexity
        long totalCompressedSize = 0;
        for (Long size : compressedSizes) {
            totalCompressedSize += size;
        }
        System.out.println("Total Compressed Size: " + totalCompressedSize);
    }
}
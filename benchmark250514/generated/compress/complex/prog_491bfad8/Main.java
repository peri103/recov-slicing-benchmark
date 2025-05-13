import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create a ZipArchiveEntry object
        ZipArchiveEntry zipEntry = new ZipArchiveEntry("example.txt");

        // Create an ArrayList to store multiple ZipArchiveEntry objects
        ArrayList<ZipArchiveEntry> zipEntries = new ArrayList<>();

        // Add the zipEntry to the list
        zipEntries.add(zipEntry);

        // Create another ZipArchiveEntry and set its size
        ZipArchiveEntry zipEntry2 = new ZipArchiveEntry("example2.txt");
        zipEntry2.setSize(2048);
        zipEntries.add(zipEntry2);

        // Perform some operations on the list
        for (ZipArchiveEntry entry : zipEntries) {
            System.out.println("Entry name: " + entry.getName());
        }

        // Set the size using the write method
        /* write */ zipEntry.setSize(1024);

        // Perform more operations on the list
        zipEntries.remove(zipEntry2);

        // Read the size using the read method
        /* read */ long size = zipEntry.getSize();

        // Print the size to ensure the read value matches the written value
        System.out.println("Size of the zip entry: " + size);

        // Create more ZipArchiveEntry objects and add them to the list
        ZipArchiveEntry zipEntry3 = new ZipArchiveEntry("example3.txt");
        zipEntry3.setSize(4096);
        zipEntries.add(zipEntry3);

        ZipArchiveEntry zipEntry4 = new ZipArchiveEntry("example4.txt");
        zipEntry4.setSize(8192);
        zipEntries.add(zipEntry4);

        // Print the sizes of all entries in the list
        for (ZipArchiveEntry entry : zipEntries) {
            System.out.println("Size of " + entry.getName() + ": " + entry.getSize());
        }
    }
}
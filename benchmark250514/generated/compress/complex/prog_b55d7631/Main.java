import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize a ZipArchiveEntry
        ZipArchiveEntry zipEntry = new ZipArchiveEntry("example.txt");

        // Initialize another ZipArchiveEntry with a different file name
        ZipArchiveEntry anotherZipEntry = new ZipArchiveEntry("another_example.txt");

        // Create a map to store file names and their sizes
        Map<String, Long> fileSizeMap = new HashMap<>();

        // Create a list to store file names
        List<String> fileNames = new ArrayList<>();

        // Add file names to the list
        fileNames.add(zipEntry.getName());
        fileNames.add(anotherZipEntry.getName());

        // Set size for the first zip entry
        /* write */ zipEntry.setSize(1024);

        // Set size for the second zip entry
        anotherZipEntry.setSize(2048);

        // Populate the map with file names and their sizes
        fileSizeMap.put(zipEntry.getName(), zipEntry.getSize());
        fileSizeMap.put(anotherZipEntry.getName(), anotherZipEntry.getSize());

        // Perform some unrelated operations
        int sumOfSizes = 0;
        for (String fileName : fileNames) {
            sumOfSizes += fileSizeMap.get(fileName);
        }

        System.out.println("Sum of all file sizes: " + sumOfSizes);

        // Retrieve the size of the first zip entry
        /* read */ long size = zipEntry.getSize();

        // Print the size of the first zip entry
        System.out.println("Size of the entry: " + size);

        // Print the sizes of all files
        for (String fileName : fileNames) {
            System.out.println("File: " + fileName + ", Size: " + fileSizeMap.get(fileName));
        }
    }
}
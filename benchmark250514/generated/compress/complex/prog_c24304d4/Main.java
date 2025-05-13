import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipFile;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ZipArchiveEntry zipEntry = new ZipArchiveEntry("example.txt");
        ArrayList<String> fileNames = new ArrayList<>();
        fileNames.add("example.txt");
        fileNames.add("test.txt");
        fileNames.add("data.txt");

        // Additional ZipArchiveEntry with its own size setting
        ZipArchiveEntry anotherZipEntry = new ZipArchiveEntry("test.txt");
        anotherZipEntry.setSize(2048);

        // Manipulate the list of file names
        for (String fileName : fileNames) {
            System.out.println("Processing file: " + fileName);
        }

        /* write */ zipEntry.setSize(1024);
        
        // Some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 natural numbers: " + sum);

        // Update the size of another ZipArchiveEntry
        anotherZipEntry.setSize(4096);

        // Perform a final read operation
        /* read */ long size = zipEntry.getSize();
        System.out.println("Size of example.txt: " + size);

        // Print sizes of all ZipArchiveEntries
        System.out.println("Size of test.txt: " + anotherZipEntry.getSize());
    }
}
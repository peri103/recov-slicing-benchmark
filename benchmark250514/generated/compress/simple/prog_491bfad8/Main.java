import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;

public class Main {
    public static void main(String[] args) {
        // Create a ZipArchiveEntry object
        ZipArchiveEntry zipEntry = new ZipArchiveEntry("example.txt");

        // Set the size using the write method
        /* write */ zipEntry.setSize(1024);

        // Read the size using the read method
        /* read */ long size = zipEntry.getSize();

        // Print the size to ensure the read value matches the written value
        System.out.println("Size of the zip entry: " + size);
    }
}
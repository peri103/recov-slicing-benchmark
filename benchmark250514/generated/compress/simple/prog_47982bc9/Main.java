import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;

public class Main {
    public static void main(String[] args) {
        // Initialize a new ZipArchiveEntry object
        ZipArchiveEntry zipEntry = new ZipArchiveEntry("example.txt");

        // Use the write method to set the compression method
        /* write */ zipEntry.setMethod(ZipArchiveEntry.DEFLATED);

        // Use the read method to get the compression method
        /* read */ int method = zipEntry.getMethod();

        // Print the method to verify it was set and read correctly
        System.out.println("Compression method: " + method);
    }
}
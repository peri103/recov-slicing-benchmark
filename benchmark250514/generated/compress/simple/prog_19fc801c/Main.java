import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;

public class Main {
    public static void main(String[] args) {
        // Initialize a ZipArchiveEntry object
        ZipArchiveEntry zipEntry = new ZipArchiveEntry("example.txt");
        
        // Set the Unix mode using the write method
        /* write */ zipEntry.setUnixMode(0755);
        
        // Read the Unix mode using the read method
        /* read */ int unixMode = zipEntry.getUnixMode();
        
        // Output the Unix mode
        System.out.println("Unix Mode: " + unixMode);
    }
}
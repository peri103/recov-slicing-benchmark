import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;

public class Main {
    public static void main(String[] args) {
        CpioArchiveEntry entry = new CpioArchiveEntry("example.txt");

        // Set the last modified time to a specific value
        long lastModifiedTime = 1625097600000L; // Example timestamp
        /* write */ entry.setLastModified(lastModifiedTime);

        // Retrieve the last modified time
        /* read */ long retrievedLastModifiedTime = entry.getLastModified();

        // Output the retrieved last modified time
        System.out.println(retrievedLastModifiedTime);
    }
}
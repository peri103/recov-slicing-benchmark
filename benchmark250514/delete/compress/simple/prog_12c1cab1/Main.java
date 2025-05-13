import org.apache.commons.compress.archivers.tar.TarArchiveEntry;

public class Main {
    public static void main(String[] args) {
        // Create a new TarArchiveEntry object
        TarArchiveEntry entry = new TarArchiveEntry("example.txt");

        // Set the modification time using the write method
        long modTime = System.currentTimeMillis();
        /* write */ entry.setModTime(modTime);

        // Read the modification time using the read method
        /* read */ long readModTime = entry.getModTime();

        // Print the modification time to verify it was correctly set and read
        System.out.println("Modification Time: " + readModTime);
    }
}
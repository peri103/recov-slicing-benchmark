import org.apache.commons.compress.archivers.jar.JarArchiveEntry;

public class Main {
    public static void main(String[] args) {
        // Create an instance of JarArchiveEntry
        JarArchiveEntry jarEntry = new JarArchiveEntry("example.jar");

        // Initialize the extra field data
        byte[] extraData = {1, 2, 3, 4, 5};

        // Use the write method to set the extra data
        /* write */ jarEntry.setExtra(extraData);

        // Use the read method to retrieve the extra data
        /* read */ byte[] retrievedData = jarEntry.getExtra();

        // Print the retrieved data to verify it matches what was set
        for (byte b : retrievedData) {
            System.out.print(b + " ");
        }
    }
}
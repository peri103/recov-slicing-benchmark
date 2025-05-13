import org.apache.commons.compress.archivers.jar.JarArchiveEntry;

public class Main {
    public static void main(String[] args) {
        // Initialize a JarArchiveEntry object
        JarArchiveEntry jarEntry = new JarArchiveEntry("example.jar");

        // Create a byte array to set as extra data
        byte[] extraData = {1, 2, 3, 4, 5};

        /* write */ jarEntry.setExtra(extraData);

        /* read */ byte[] retrievedData = jarEntry.getExtra();

        // Print the retrieved extra data to verify it matches what was set
        for (byte b : retrievedData) {
            System.out.print(b + " ");
        }
    }
}
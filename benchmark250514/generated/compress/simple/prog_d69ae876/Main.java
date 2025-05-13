import org.apache.commons.compress.archivers.jar.JarArchiveEntry;

public class Main {
    public static void main(String[] args) {
        JarArchiveEntry entry = new JarArchiveEntry("example.jar");

        // Create a byte array to use as extra data
        byte[] extraData = {1, 2, 3, 4};

        /* write */ entry.setExtra(extraData);

        /* read */ byte[] retrievedData = entry.getExtra();

        // Print the retrieved data to verify
        for (byte b : retrievedData) {
            System.out.print(b + " ");
        }
    }
}
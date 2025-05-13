import org.apache.commons.compress.archivers.tar.TarArchiveEntry;

public class Main {
    public static void main(String[] args) {
        // Initialize a TarArchiveEntry object
        TarArchiveEntry tarEntry = new TarArchiveEntry("example.txt");

        // Set the mode using the write method
        /* write */ tarEntry.setMode(0644);

        // Read the mode using the read method
        /* read */ int mode = tarEntry.getMode();

        // Print the mode to verify it was set and read correctly
        System.out.println("Mode: " + Integer.toOctalString(mode));
    }
}
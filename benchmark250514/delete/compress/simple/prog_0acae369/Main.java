import org.apache.commons.compress.archivers.ar.ArArchiveEntry;

public class Main {
    public static void main(String[] args) {
        // Initialize an ArArchiveEntry object
        ArArchiveEntry archiveEntry = new ArArchiveEntry("example.txt", 1000);

        // Write operation: set the mode of the archive entry
        /* write */ archiveEntry.setMode(0755);

        // Read operation: get the mode of the archive entry
        /* read */ int mode = archiveEntry.getMode();

        // Print the mode to verify it was set correctly
        System.out.println("Mode: " + mode);
    }
}
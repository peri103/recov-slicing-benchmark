import org.apache.commons.compress.archivers.dump.DumpArchiveEntry;

public class Main {
    public static void main(String[] args) {
        // Initialize the DumpArchiveEntry object
        DumpArchiveEntry entry = new DumpArchiveEntry();

        // Write operation: Set the mode
        /* write */ entry.setMode(12345);

        // Read operation: Get the mode
        /* read */ int mode = entry.getMode();

        // Print the mode to verify the read operation
        System.out.println(mode);
    }
}
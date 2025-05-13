import org.apache.commons.compress.archivers.dump.DumpArchiveEntry;

public class Main {
    public static void main(String[] args) {
        // Initialize the DumpArchiveEntry object
        DumpArchiveEntry entry = new DumpArchiveEntry();

        // Set external attributes using the write method
        /* write */ entry.setExternalAttributes(12345);

        // Read the external attributes using the read method
        /* read */ int externalAttributes = entry.getExternalAttributes();

        // Print the read value to verify the operation
        System.out.println(externalAttributes);
    }
}
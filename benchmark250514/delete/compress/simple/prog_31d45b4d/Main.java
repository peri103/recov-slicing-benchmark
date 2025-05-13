import org.apache.commons.compress.archivers.dump.DumpArchiveEntry;

public class Main {
    public static void main(String[] args) {
        // Initialize a DumpArchiveEntry object
        DumpArchiveEntry entry = new DumpArchiveEntry();

        // Set external attributes using the write method
        /* write */ entry.setExternalAttributes(12345);

        // Read external attributes using the read method
        /* read */ long externalAttributes = entry.getExternalAttributes();

        // Print the read value to verify
        System.out.println(externalAttributes);
    }
}
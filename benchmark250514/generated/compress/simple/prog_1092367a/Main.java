import org.apache.commons.compress.archivers.dump.DumpArchiveEntry;

public class Main {
    public static void main(String[] args) {
        // Initialize the DumpArchiveEntry object
        DumpArchiveEntry entry = new DumpArchiveEntry();

        // Set a group ID using the write method
        /* write */ entry.setGroupId(12345);

        // Read the group ID using the read method
        /* read */ long groupId = entry.getGroupId();

        // Print the value to verify
        System.out.println(groupId);
    }
}
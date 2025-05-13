import org.apache.commons.compress.archivers.tar.TarArchiveEntry;

public class Main {
    public static void main(String[] args) {
        // Initialize a TarArchiveEntry object
        TarArchiveEntry entry = new TarArchiveEntry("example.txt");

        // Set the group ID using the write method
        /* write */ entry.setGroupId(1001);

        // Read the group ID using the read method
        /* read */ long groupId = entry.getGroupId();

        // Output the group ID to verify the correctness
        System.out.println(groupId);
    }
}
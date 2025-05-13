import org.apache.commons.compress.archivers.ar.ArArchiveEntry;

public class Main {
    public static void main(String[] args) {
        // Initialize an ArArchiveEntry object
        ArArchiveEntry entry = new ArArchiveEntry("example.txt", 100);

        // Use the write method to set the group ID
        /* write */ entry.setGroupId(12345);

        // Use the read method to get the group ID
        /* read */ long groupId = entry.getGroupId();

        // Print the group ID to verify the read operation
        System.out.println(groupId);
    }
}
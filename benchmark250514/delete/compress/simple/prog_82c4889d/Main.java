import org.apache.commons.compress.archivers.ar.ArArchiveEntry;

public class Main {
    public static void main(String[] args) {
        // Create an instance of ArArchiveEntry
        ArArchiveEntry entry = new ArArchiveEntry("example.txt", 1000);

        // Write the group ID using setGroupId
        /* write */ entry.setGroupId(12345);

        // Read the group ID using getGroupId
        /* read */ long groupId = entry.getGroupId();

        // Print the group ID to verify
        System.out.println(groupId);
    }
}
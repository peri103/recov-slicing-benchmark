import org.apache.commons.compress.archivers.ar.ArArchiveEntry;

public class Main {
    public static void main(String[] args) {
        // Create an instance of ArArchiveEntry
        ArArchiveEntry entry = new ArArchiveEntry("example.txt", 100);
        
        // Write operation: set group ID
        /* write */ entry.setGroupId(12345);
        
        // Read operation: get group ID
        /* read */ long groupId = entry.getGroupId();
        
        // Print the group ID to verify the read operation
        System.out.println(groupId);
    }
}
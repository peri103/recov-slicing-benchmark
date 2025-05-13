import org.apache.commons.compress.archivers.ar.ArArchiveEntry;

public class Main {
    public static void main(String[] args) {
        // Initialize an ArArchiveEntry object
        ArArchiveEntry entry = new ArArchiveEntry("example.txt", 1000);
        
        // Set the group ID using the write method
        /* write */ entry.setGroupId(12345);
        
        // Retrieve the group ID using the read method
        /* read */ long groupId = entry.getGroupId();
        
        // Print the group ID to verify the operation
        System.out.println("Group ID: " + groupId);
    }
}
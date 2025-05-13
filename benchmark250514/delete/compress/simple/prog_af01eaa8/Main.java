import org.apache.commons.compress.archivers.ar.ArArchiveEntry;

public class Main {
    public static void main(String[] args) {
        // Initialize an ArArchiveEntry object
        ArArchiveEntry entry = new ArArchiveEntry("dummy", 100);

        // Use the write method to set the username
        /* write */ entry.setUserName("testUser");

        // Use the read method to retrieve the username
        /* read */ String userName = entry.getUserName();
        
        // Print the retrieved username to ensure the read method worked correctly
        System.out.println(userName);
    }
}
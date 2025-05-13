import org.apache.commons.compress.archivers.tar.TarArchiveEntry;

public class Main {
    public static void main(String[] args) {
        // Create an instance of TarArchiveEntry
        TarArchiveEntry entry = new TarArchiveEntry("example.txt");
        
        // Use the write method to set the user name
        /* write */ entry.setUserName("testUser");

        // Use the read method to get the user name
        /* read */ String userName = entry.getUserName();
        
        // Print the user name to ensure it's correctly read
        System.out.println(userName);
    }
}
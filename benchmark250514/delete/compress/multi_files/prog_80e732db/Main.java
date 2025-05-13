import org.apache.commons.compress.archivers.ar.ArArchiveEntry;

public class Main {
    public static void main(String[] args) {
        ArchiveManager archiveManager = new ArchiveManager();
        UserManager userManager = new UserManager();

        // Add some user names
        userManager.addUserName("user1");
        userManager.addUserName("user2");
        userManager.addUserName("testUser");

        // Add an entry to the archive
        archiveManager.addEntry("example.txt", 1000, "testUser");

        // Retrieve and print user names
        for (String user : userManager.getUserNames()) {
            System.out.println("User: " + user);
        }

        // Retrieve the entry from the archive and get its userName
        ArArchiveEntry retrievedEntry = archiveManager.getEntry("example.txt");

        /* read */ String userName = retrievedEntry.getUserName();
        
        // Print the retrieved userName
        System.out.println("Retrieved UserName: " + userName);

        // Perform some calculations
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i * 10;
        }
        
        // Print the result of the calculations
        System.out.println("Sum: " + sum);
    }
}
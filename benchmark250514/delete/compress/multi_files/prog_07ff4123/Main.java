import org.apache.commons.compress.archivers.ar.ArArchiveEntry;

public class Main {
    public static void main(String[] args) {
        ArchiveEntryManager manager = new ArchiveEntryManager();
        ArchiveAnalyzer analyzer = new ArchiveAnalyzer();

        // Create and add entries
        ArArchiveEntry entry1 = new ArArchiveEntry("example.txt", 1000);
        ArArchiveEntry entry2 = new ArArchiveEntry("example2.txt", 2000);
        manager.addEntry(entry1);
        manager.addEntry(entry2);

        // Set user ID for the first entry
        manager.setEntryUserId(0, 12345);

        // Analyze and print the user ID of the first entry
        long userId = analyzer.analyzeEntryUserId(manager.getEntry(0));
        System.out.println("User ID of the first entry: " + userId);

        // Print the user IDs of all entries
        for (int i = 0; i < 2; i++) {
            ArArchiveEntry entry = manager.getEntry(i);
            System.out.println("Entry: " + entry.getName() + ", User ID: " + entry.getUserId());
        }
    }
}
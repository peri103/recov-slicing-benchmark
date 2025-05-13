public class Main {
    public static void main(String[] args) {
        ArchiveManager manager = new ArchiveManager();
        
        ArchiveEntry entry1 = new ArchiveEntry("example.txt", 100);
        entry1.setUserId(12345);
        manager.addEntry(entry1);
        
        ArchiveEntry entry2 = new ArchiveEntry("another.txt", 200);
        entry2.setUserId(67890);
        manager.addEntry(entry2);
        
        manager.printEntries();
        
        ArchiveEntry retrievedEntry = manager.getEntry("example.txt");
        /* read */ int userId = retrievedEntry.getUserId();
        System.out.println("Retrieved User ID for " + retrievedEntry.getName() + ": " + userId);
    }
}
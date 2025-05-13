public class Main {
    public static void main(String[] args) {
        ArchiveManager manager = new ArchiveManager();
        
        manager.addEntry("File1", 1000);
        manager.addEntry("File2", 2000);
        
        manager.updateEntrySize(0, 12345);
        
        manager.displayAllEntries();
        
        long size = manager.getEntrySize(0);
        System.out.println("Updated Size of Entry 0: " + size);
    }
}
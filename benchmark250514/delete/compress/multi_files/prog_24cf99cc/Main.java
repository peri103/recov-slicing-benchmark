public class Main {
    public static void main(String[] args) {
        ArchiveEntryManager manager = new ArchiveEntryManager();
        manager.addEntry("example.txt", 1000, 12345678L);
        manager.addEntry("example2.txt", 2000, 87654321L);
        
        ArchiveProcessor processor = new ArchiveProcessor(manager);
        processor.processEntry("example.txt");
        processor.processEntry("example2.txt");
        
        manager.printAllEntries();
        
        // Additional unrelated code
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of numbers from 1 to 5: " + product);
    }
}
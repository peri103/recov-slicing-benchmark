import org.apache.commons.compress.archivers.dump.DumpArchiveEntry;

public class Main {
    public static void main(String[] args) {
        ArchiveEntryManager manager = new ArchiveEntryManager();
        DumpArchiveEntry entry = new DumpArchiveEntry();

        // Set size of the entry
        manager.setEntrySize(entry, 1024);
        manager.addEntry(entry);

        // Create another entry and add to manager
        DumpArchiveEntry anotherEntry = new DumpArchiveEntry();
        manager.setEntrySize(anotherEntry, 2048);
        manager.addEntry(anotherEntry);

        // Process entries to get their sizes
        ArchiveEntryProcessor processor = new ArchiveEntryProcessor(manager);
        long entrySize = processor.getEntrySize(entry);
        System.out.println("Size of the original entry: " + entrySize);

        long anotherEntrySize = processor.getEntrySize(anotherEntry);
        System.out.println("Size of another entry: " + anotherEntrySize);
    }
}
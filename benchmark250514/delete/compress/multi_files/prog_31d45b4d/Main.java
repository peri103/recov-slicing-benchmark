import org.apache.commons.compress.archivers.dump.DumpArchiveEntry;

public class Main {
    public static void main(String[] args) {
        // Create a DumpArchiveManager to manage entries
        DumpArchiveManager manager = new DumpArchiveManager();

        // Create a DumpArchiveEntry
        DumpArchiveEntry entry = new DumpArchiveEntry();
        manager.addEntry(entry);

        // Set external attributes using the manager
        manager.setExternalAttributes(entry, 12345);

        // Create another entry and add it to the manager
        DumpArchiveEntry anotherEntry = new DumpArchiveEntry();
        manager.addEntry(anotherEntry);
        manager.setExternalAttributes(anotherEntry, 67890);

        // Print total external attributes
        System.out.println("Total external attributes: " + manager.getTotalExternalAttributes());

        // Use ArchiveReport to print attributes of the first entry
        ArchiveReport report = new ArchiveReport();
        report.printEntryAttributes(entry);
    }
}
import org.apache.commons.compress.archivers.ar.ArArchiveEntry;

public class ArchiveManager {
    private ArchiveEntryManager entryManager = new ArchiveEntryManager();

    public void addEntry(String name, long size) {
        entryManager.addEntry(name, size);
    }

    public void updateEntrySize(int index, long newSize) {
        entryManager.updateEntrySize(index, newSize);
    }

    public long getEntrySize(int index) {
        ArArchiveEntry entry = entryManager.getEntry(index);
        if (entry != null) {
            /* read */ return entry.getSize();
        }
        return -1;
    }

    public void displayAllEntries() {
        for (ArArchiveEntry entry : entryManager.getAllEntries()) {
            System.out.println("Entry Name: " + entry.getName() + ", Size: " + entry.getSize());
        }
    }
}

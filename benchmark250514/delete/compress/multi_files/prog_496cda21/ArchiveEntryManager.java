import org.apache.commons.compress.archivers.ar.ArArchiveEntry;
import java.util.ArrayList;

public class ArchiveEntryManager {
    private ArrayList<ArArchiveEntry> entries = new ArrayList<>();

    public void addEntry(String name, long size) {
        ArArchiveEntry entry = new ArArchiveEntry(name, size);
        entries.add(entry);
    }

    public void updateEntrySize(int index, long newSize) {
        if (index >= 0 && index < entries.size()) {
            /* write */ entries.get(index).setSize(newSize);
        }
    }

    public ArArchiveEntry getEntry(int index) {
        if (index >= 0 && index < entries.size()) {
            return entries.get(index);
        }
        return null;
    }

    public ArrayList<ArArchiveEntry> getAllEntries() {
        return entries;
    }
}

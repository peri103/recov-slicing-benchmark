import org.apache.commons.compress.archivers.ar.ArArchiveEntry;
import java.util.ArrayList;

public class ArchiveEntryManager {
    private ArrayList<ArArchiveEntry> entries = new ArrayList<>();

    public void addEntry(String name, long size) {
        ArArchiveEntry entry = new ArArchiveEntry(name, size);
        /* write */ entry.setLastModified(System.currentTimeMillis());
        entries.add(entry);
    }

    public ArArchiveEntry getEntry(int index) {
        return entries.get(index);
    }
}

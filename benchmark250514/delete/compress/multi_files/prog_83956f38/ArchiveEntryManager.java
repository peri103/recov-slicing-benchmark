import org.apache.commons.compress.archivers.ar.ArArchiveEntry;
import java.util.ArrayList;

public class ArchiveEntryManager {
    private ArrayList<ArArchiveEntry> entries = new ArrayList<>();

    public void addEntry(ArArchiveEntry entry) {
        entries.add(entry);
    }

    public ArArchiveEntry getEntry(String name) {
        for (ArArchiveEntry entry : entries) {
            if (entry.getName().equals(name)) {
                return entry;
            }
        }
        return null;
    }

    public void updateUserId(String name, int userId) {
        ArArchiveEntry entry = getEntry(name);
        if (entry != null) {
            /* write */ entry.setUserId(userId);
        }
    }
}

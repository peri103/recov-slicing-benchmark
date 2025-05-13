import org.apache.commons.compress.archivers.ar.ArArchiveEntry;
import java.util.ArrayList;
import java.util.List;

public class ArchiveEntryManager {
    private List<ArArchiveEntry> entries = new ArrayList<>();

    public void addEntry(ArArchiveEntry entry) {
        entries.add(entry);
    }

    public ArArchiveEntry getEntry(int index) {
        return entries.get(index);
    }

    public void setEntryUserId(int index, long userId) {
        ArArchiveEntry entry = entries.get(index);
        /* write */ entry.setUserId(userId);
    }
}

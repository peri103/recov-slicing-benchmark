import org.apache.commons.compress.archivers.ar.ArArchiveEntry;
import java.util.ArrayList;

public class ArchiveEntryManager {
    private ArrayList<ArArchiveEntry> entries = new ArrayList<>();

    public void addEntry(String name, long length, long groupId) {
        ArArchiveEntry entry = new ArArchiveEntry(name, length);
        /* write */ entry.setGroupId(groupId);
        entries.add(entry);
    }

    public ArArchiveEntry getEntry(int index) {
        return entries.get(index);
    }
}

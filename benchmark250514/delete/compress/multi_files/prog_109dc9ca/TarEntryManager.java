import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import java.util.ArrayList;

public class TarEntryManager {
    private ArrayList<TarArchiveEntry> entries = new ArrayList<>();

    public void addEntry(TarArchiveEntry entry) {
        entries.add(entry);
    }

    public void setGroupIdForEntry(String entryName, long groupId) {
        for (TarArchiveEntry entry : entries) {
            if (entry.getName().equals(entryName)) {
                /* write */ entry.setGroupId(groupId);
            }
        }
    }

    public TarArchiveEntry getEntry(String entryName) {
        for (TarArchiveEntry entry : entries) {
            if (entry.getName().equals(entryName)) {
                return entry;
            }
        }
        return null;
    }
}

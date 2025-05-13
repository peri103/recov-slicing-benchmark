import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import java.util.HashMap;
import java.util.Map;

public class ArchiveEntryManager {
    private Map<String, TarArchiveEntry> archiveMap = new HashMap<>();

    public void addEntry(String name, TarArchiveEntry entry) {
        archiveMap.put(name, entry);
    }

    public TarArchiveEntry getEntry(String name) {
        return archiveMap.get(name);
    }

    public void setEntryGroupId(String name, long groupId) {
        TarArchiveEntry entry = archiveMap.get(name);
        if (entry != null) {
            /* write */ entry.setGroupId(groupId);
        }
    }
}

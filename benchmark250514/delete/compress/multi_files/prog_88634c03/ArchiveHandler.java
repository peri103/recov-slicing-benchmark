import org.apache.commons.compress.archivers.ar.ArArchiveEntry;
import java.util.HashMap;

public class ArchiveHandler {
    private ArArchiveEntry entry;
    private HashMap<String, Long> archiveMap;

    public ArchiveHandler(String fileName, long fileSize) {
        entry = new ArArchiveEntry(fileName, fileSize);
        archiveMap = new HashMap<>();
    }

    public void setGroupId(long groupId) {
        /* write */ entry.setGroupId(groupId);
    }

    public long getEntrySize() {
        return entry.getSize();
    }

    public void addToArchiveMap() {
        archiveMap.put(entry.getName(), entry.getSize());
    }

    public HashMap<String, Long> getArchiveMap() {
        return archiveMap;
    }

    public long getGroupId() {
        return entry.getGroupId();
    }
}

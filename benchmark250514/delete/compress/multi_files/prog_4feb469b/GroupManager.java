import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;
import java.util.HashMap;

public class GroupManager {
    private HashMap<String, CpioArchiveEntry> entryMap = new HashMap<>();

    public void addEntry(String name, long groupId) {
        CpioArchiveEntry entry = new CpioArchiveEntry(name);
        /* write */ entry.setGroupId(groupId);
        entryMap.put(name, entry);
    }

    public CpioArchiveEntry getEntry(String name) {
        return entryMap.get(name);
    }
}

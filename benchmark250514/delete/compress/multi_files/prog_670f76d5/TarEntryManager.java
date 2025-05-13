import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import java.util.HashMap;

public class TarEntryManager {
    private HashMap<String, TarArchiveEntry> entries = new HashMap<>();

    public void addEntry(String name, int fileType) {
        TarArchiveEntry entry = new TarArchiveEntry(name);
        /* write */ entry.setFileType(fileType);
        entries.put(name, entry);
    }

    public int getEntryFileType(String name) {
        TarArchiveEntry entry = entries.get(name);
        return entry != null ? entry.getFileType() : -1;
    }
}

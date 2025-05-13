import org.apache.commons.compress.archivers.ar.ArArchiveEntry;
import java.util.HashMap;

public class ArchiveManager {
    private HashMap<String, ArArchiveEntry> archiveMap = new HashMap<>();

    public void addEntry(String fileName, long size, String userName) {
        ArArchiveEntry entry = new ArArchiveEntry(fileName, size);
        /* write */ entry.setUserName(userName);
        archiveMap.put(fileName, entry);
    }

    public ArArchiveEntry getEntry(String fileName) {
        return archiveMap.get(fileName);
    }
}

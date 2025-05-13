import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import java.util.HashMap;
import java.util.Map;

public class ArchiveManager {
    private Map<String, ZipArchiveEntry> zipEntriesMap = new HashMap<>();

    public void addEntry(String fileName, int unixMode) {
        ZipArchiveEntry entry = new ZipArchiveEntry(fileName);
        /* write */ entry.setUnixMode(unixMode);
        zipEntriesMap.put(fileName, entry);
    }

    public ZipArchiveEntry getEntry(String fileName) {
        return zipEntriesMap.get(fileName);
    }
}

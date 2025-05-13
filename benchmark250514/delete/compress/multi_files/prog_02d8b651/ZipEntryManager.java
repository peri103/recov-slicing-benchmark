import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import java.util.HashMap;
import java.util.Map;

public class ZipEntryManager {
    private Map<String, ZipArchiveEntry> entryMap = new HashMap<>();

    public void addEntry(String key, String name) {
        ZipArchiveEntry entry = new ZipArchiveEntry(name);
        entryMap.put(key, entry);
    }

    public void updateEntryName(String key, String newName) {
        ZipArchiveEntry entry = entryMap.get(key);
        if (entry != null) {
            /* write */ entry.setName(newName);
        }
    }

    public String getEntryName(String key) {
        ZipArchiveEntry entry = entryMap.get(key);
        if (entry != null) {
            return entry.getName();
        }
        return null;
    }

    public void printAllEntries() {
        for (Map.Entry<String, ZipArchiveEntry> mapEntry : entryMap.entrySet()) {
            System.out.println("Key: " + mapEntry.getKey() + ", Entry Name: " + mapEntry.getValue().getName());
        }
    }
}

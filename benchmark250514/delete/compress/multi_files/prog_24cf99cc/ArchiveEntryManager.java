import org.apache.commons.compress.archivers.ar.ArArchiveEntry;
import java.util.HashMap;
import java.util.Map;

public class ArchiveEntryManager {
    private Map<String, ArArchiveEntry> archiveMap = new HashMap<>();
    
    public void addEntry(String name, long size, long crc) {
        ArArchiveEntry entry = new ArArchiveEntry(name, size);
        /* write */ entry.setCrc(crc);
        archiveMap.put(name, entry);
    }
    
    public ArArchiveEntry getEntry(String name) {
        return archiveMap.get(name);
    }
    
    public void printAllEntries() {
        for (Map.Entry<String, ArArchiveEntry> mapEntry : archiveMap.entrySet()) {
            System.out.println("Entry Name: " + mapEntry.getKey());
            System.out.println("Entry CRC: " + mapEntry.getValue().getCrc());
        }
    }
}

import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import java.util.ArrayList;
import java.util.HashMap;

public class ZipEntryManager {
    private ArrayList<ZipArchiveEntry> entryList = new ArrayList<>();
    private HashMap<String, Long> fileSizeMap = new HashMap<>();

    public void addEntry(String fileName, long size) {
        ZipArchiveEntry entry = new ZipArchiveEntry(fileName);
        /* write */ entry.setSize(size);
        entryList.add(entry);
        fileSizeMap.put(fileName, size);
    }

    public long getEntrySize(String fileName) {
        ZipArchiveEntry entry = null;
        for (ZipArchiveEntry e : entryList) {
            if (e.getName().equals(fileName)) {
                entry = e;
                break;
            }
        }
        if (entry != null) {
            return entry.getSize();
        }
        return -1; // Return -1 if entry not found
    }

    public void printAllEntries() {
        for (ZipArchiveEntry entry : entryList) {
            System.out.println("Entry: " + entry.getName() + ", Size: " + entry.getSize());
        }
    }
}

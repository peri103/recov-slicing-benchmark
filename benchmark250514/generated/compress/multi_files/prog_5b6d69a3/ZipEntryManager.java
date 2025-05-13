import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import java.util.ArrayList;

public class ZipEntryManager {
    private ArrayList<ZipArchiveEntry> zipEntries = new ArrayList<>();

    public void addEntry(String name, long size) {
        ZipArchiveEntry entry = new ZipArchiveEntry(name);
        /* write */ entry.setSize(size);
        zipEntries.add(entry);
    }

    public ZipArchiveEntry getEntry(String name) {
        for (ZipArchiveEntry entry : zipEntries) {
            if (entry.getName().equals(name)) {
                return entry;
            }
        }
        return null;
    }

    public ArrayList<ZipArchiveEntry> getAllEntries() {
        return zipEntries;
    }
}

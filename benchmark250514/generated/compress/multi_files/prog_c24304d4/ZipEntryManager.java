import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import java.util.ArrayList;

public class ZipEntryManager {
    private ArrayList<ZipArchiveEntry> entries = new ArrayList<>();

    public void addEntry(String name, long size) {
        ZipArchiveEntry entry = new ZipArchiveEntry(name);
        /* write */ entry.setSize(size);
        entries.add(entry);
    }

    public ZipArchiveEntry getEntry(int index) {
        return entries.get(index);
    }

    public ArrayList<ZipArchiveEntry> getAllEntries() {
        return entries;
    }
}

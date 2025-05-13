import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import java.util.ArrayList;

public class ZipEntryManager {
    private ArrayList<ZipArchiveEntry> entryList = new ArrayList<>();

    public void addEntry(String fileName, int unixMode) {
        ZipArchiveEntry entry = new ZipArchiveEntry(fileName);
        /* write */ entry.setUnixMode(unixMode);
        entryList.add(entry);
    }

    public ZipArchiveEntry getEntry(int index) {
        return entryList.get(index);
    }

    public ArrayList<ZipArchiveEntry> getAllEntries() {
        return entryList;
    }
}

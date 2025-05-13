import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import java.util.ArrayList;

public class ZipEntryManager {
    private ArrayList<ZipArchiveEntry> zipEntries = new ArrayList<>();

    public void addEntry(ZipArchiveEntry entry) {
        zipEntries.add(entry);
    }

    public ZipArchiveEntry getEntry(int index) {
        return zipEntries.get(index);
    }

    public ArrayList<ZipArchiveEntry> getAllEntries() {
        return zipEntries;
    }
}

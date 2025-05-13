import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import java.util.ArrayList;
import java.util.List;

public class ZipEntryManager {
    private List<ZipArchiveEntry> zipEntries = new ArrayList<>();

    public void addEntry(ZipArchiveEntry entry) {
        zipEntries.add(entry);
    }

    public void setEntryMethod(String entryName, int method) {
        for (ZipArchiveEntry entry : zipEntries) {
            if (entry.getName().equals(entryName)) {
                /* write */ entry.setMethod(method);
                break;
            }
        }
    }

    public List<ZipArchiveEntry> getEntries() {
        return zipEntries;
    }
}

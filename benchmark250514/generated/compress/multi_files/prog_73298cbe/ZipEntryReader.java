import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import java.util.List;

public class ZipEntryReader {
    private ZipEntryManager manager;

    public ZipEntryReader(ZipEntryManager manager) {
        this.manager = manager;
    }

    public int getEntryMethod(String entryName) {
        List<ZipArchiveEntry> entries = manager.getEntries();
        for (ZipArchiveEntry entry : entries) {
            if (entry.getName().equals(entryName)) {
                /* read */ return entry.getMethod();
            }
        }
        return -1; // Return -1 if entry not found
    }
}

import org.apache.commons.compress.archivers.dump.DumpArchiveEntry;
import java.util.ArrayList;
import java.util.List;

public class DumpArchiveManager {
    private List<DumpArchiveEntry> entries = new ArrayList<>();

    public void addEntry(DumpArchiveEntry entry) {
        entries.add(entry);
    }

    public void setExternalAttributes(DumpArchiveEntry entry, long attributes) {
        /* write */ entry.setExternalAttributes(attributes);
    }

    public long getTotalExternalAttributes() {
        long total = 0;
        for (DumpArchiveEntry entry : entries) {
            total += entry.getExternalAttributes();
        }
        return total;
    }
}

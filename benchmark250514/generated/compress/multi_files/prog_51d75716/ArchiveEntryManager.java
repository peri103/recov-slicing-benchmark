import org.apache.commons.compress.archivers.dump.DumpArchiveEntry;
import java.util.ArrayList;
import java.util.List;

public class ArchiveEntryManager {
    private List<DumpArchiveEntry> entries = new ArrayList<>();

    public void addEntry(DumpArchiveEntry entry) {
        entries.add(entry);
    }

    public List<DumpArchiveEntry> getEntries() {
        return entries;
    }

    public void setEntrySize(DumpArchiveEntry entry, long size) {
        /* write */ entry.setSize(size);
    }
}

import org.apache.commons.compress.archivers.dump.DumpArchiveEntry;
import java.util.ArrayList;

public class ArchiveEntryManager {
    private ArrayList<DumpArchiveEntry> entryList = new ArrayList<>();

    public void addEntry(DumpArchiveEntry entry) {
        entryList.add(entry);
    }

    public DumpArchiveEntry getEntry(int index) {
        if (index >= 0 && index < entryList.size()) {
            return entryList.get(index);
        }
        return null;
    }

    public int getTotalEntries() {
        return entryList.size();
    }
}

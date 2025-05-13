import java.util.ArrayList;
import java.util.List;

public class ArchiveManager {
    private List<DumpArchiveEntryWrapper> entries = new ArrayList<>();

    public void addEntry(DumpArchiveEntryWrapper entry) {
        entries.add(entry);
    }

    public DumpArchiveEntryWrapper getEntry(int index) {
        return entries.get(index);
    }
}

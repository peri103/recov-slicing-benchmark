import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import java.util.ArrayList;

public class ArchiveEntryManager {
    private ArrayList<TarArchiveEntry> archiveList = new ArrayList<>();

    public void addEntry(String name, long size) {
        TarArchiveEntry entry = new TarArchiveEntry(name);
        /* write */ entry.setSize(size);
        archiveList.add(entry);
    }

    public ArrayList<TarArchiveEntry> getArchiveList() {
        return archiveList;
    }
}

import org.apache.commons.compress.archivers.ar.ArArchiveEntry;
import java.util.ArrayList;

public class ArchiveManager {
    private ArrayList<ArArchiveEntry> archiveList = new ArrayList<>();

    public void addEntry(ArArchiveEntry entry) {
        /* write */ entry.setLastModified(System.currentTimeMillis());
        archiveList.add(entry);
    }

    public ArrayList<ArArchiveEntry> getArchiveList() {
        return archiveList;
    }
}

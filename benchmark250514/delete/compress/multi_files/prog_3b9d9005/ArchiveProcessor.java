import org.apache.commons.compress.archivers.ar.ArArchiveEntry;
import java.util.ArrayList;

public class ArchiveProcessor {
    private ArchiveEntryManager manager = new ArchiveEntryManager();

    public void processEntries() {
        manager.addEntry("example.txt", 100);
        manager.addEntry("another_example.txt", 200);
    }

    public long getLastModified(int index) {
        ArArchiveEntry entry = manager.getEntry(index);
        /* read */ return entry.getLastModified();
    }
}

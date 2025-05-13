import org.apache.commons.compress.archivers.tar.TarArchiveEntry;

public class ArchiveReader {
    private ArchiveEntryManager manager;

    public ArchiveReader(ArchiveEntryManager manager) {
        this.manager = manager;
    }

    public long getEntryGroupId(String name) {
        TarArchiveEntry entry = manager.getEntry(name);
        if (entry != null) {
            /* read */ return entry.getGroupId();
        }
        return -1;
    }
}

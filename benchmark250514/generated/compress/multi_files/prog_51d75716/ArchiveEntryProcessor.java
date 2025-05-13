import org.apache.commons.compress.archivers.dump.DumpArchiveEntry;

public class ArchiveEntryProcessor {
    private ArchiveEntryManager manager;

    public ArchiveEntryProcessor(ArchiveEntryManager manager) {
        this.manager = manager;
    }

    public long getEntrySize(DumpArchiveEntry entry) {
        /* read */ return entry.getSize();
    }
}

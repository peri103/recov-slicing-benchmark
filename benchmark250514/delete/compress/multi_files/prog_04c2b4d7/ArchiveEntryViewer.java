import org.apache.commons.compress.archivers.ar.ArArchiveEntry;

public class ArchiveEntryViewer {
    private ArArchiveEntry entry;

    public ArchiveEntryViewer(ArArchiveEntry entry) {
        this.entry = entry;
    }

    public long viewAttributes() {
        /* read */ return entry.getExternalAttributes();
    }
}

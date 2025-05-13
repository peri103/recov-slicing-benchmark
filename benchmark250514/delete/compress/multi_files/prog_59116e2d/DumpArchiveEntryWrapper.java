import org.apache.commons.compress.archivers.dump.DumpArchiveEntry;

public class DumpArchiveEntryWrapper {
    private DumpArchiveEntry entry;

    public DumpArchiveEntryWrapper() {
        this.entry = new DumpArchiveEntry();
    }

    public void setCompressedSize(long size) {
        /* write */ entry.setCompressedSize(size);
    }

    public long getCompressedSize() {
        return entry.getCompressedSize();
    }
}

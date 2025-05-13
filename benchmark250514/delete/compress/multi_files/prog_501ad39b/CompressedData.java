import org.apache.commons.compress.archivers.dump.DumpArchiveEntry;

public class CompressedData {
    private DumpArchiveEntry entry;

    public CompressedData() {
        this.entry = new DumpArchiveEntry();
    }

    public void setCompressedSize(long size) {
        /* write */ entry.setCompressedSize(size);
    }

    public long getCompressedSize() {
        return entry.getCompressedSize();
    }
}

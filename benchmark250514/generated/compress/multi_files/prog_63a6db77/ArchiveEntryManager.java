import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;

public class ArchiveEntryManager {
    private CpioArchiveEntry entry;

    public ArchiveEntryManager(String entryName) {
        this.entry = new CpioArchiveEntry(entryName);
    }

    public void setEntrySize(long size) {
        /* write */ entry.setSize(size);
    }

    public long getEntrySize() {
        return entry.getSize();
    }
}
